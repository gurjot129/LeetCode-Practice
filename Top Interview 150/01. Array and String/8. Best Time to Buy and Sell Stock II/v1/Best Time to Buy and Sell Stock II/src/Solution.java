import java.util.Arrays;

public class Solution {

    public int maxProfit(int[] prices) {

        //creates and initializes variables
        int buyIdx = 0;
        int sellIdx = 1;

        int[] sellIdxProfits = new int[prices.length - 1];
        int sellIdxProfitsLen = 0;

        int maxProfit = 0;
        int sellCount = 0;

        //iterates through the prices array
        while(sellIdx < prices.length && sellCount < 2) {

            if(prices[buyIdx] < prices[sellIdx]) {

                if(sellIdxProfitsLen > 0) {

                    boolean isCurrSellGreater = true;

                    for(int i = 0; i < sellIdxProfitsLen && isCurrSellGreater; ++i) {

                        if (prices[sellIdx] < prices[sellIdxProfits[i]]) {
                            isCurrSellGreater = false;
                        }
                    }

                    if(isCurrSellGreater == true) {
                        sellIdxProfits[sellIdxProfitsLen] = sellIdx;
                        ++sellIdxProfitsLen;
                    } else {

                        int maxSellVal = prices[sellIdxProfits[0]];

                        for(int i = 0; i < sellIdxProfitsLen; ++i) {

                            if (prices[sellIdxProfits[i]] > maxSellVal) {
                                maxSellVal = prices[sellIdxProfits[i]];
                            }
                        }

                        maxProfit += (maxSellVal - prices[buyIdx]);
                        ++sellCount;

                        //fills with custom default values
                        Arrays.fill(sellIdxProfits, 0);
                        sellIdxProfitsLen = 0;

                        buyIdx = sellIdx;
                    }

                } else {
                    sellIdxProfits[sellIdxProfitsLen] = sellIdx;
                    ++sellIdxProfitsLen;
                }
            }
            else {
                buyIdx = sellIdx;
            }

            //ensures that we evaluate every sell price regardless of conditions above
            ++sellIdx;
        }

        if(sellIdxProfitsLen > 0) {

            int maxSellVal = prices[sellIdxProfits[0]];

            for(int i = 0; i < sellIdxProfitsLen; ++i) {

                if (prices[sellIdxProfits[i]] > maxSellVal) {
                    maxSellVal = prices[sellIdxProfits[i]];
                }
            }

            maxProfit += (maxSellVal - prices[buyIdx]);
        }

        return maxProfit;
    }
}
