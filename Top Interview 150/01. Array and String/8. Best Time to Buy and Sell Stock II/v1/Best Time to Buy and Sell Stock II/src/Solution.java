import jdk.jshell.spi.ExecutionControl;

public class Solution {

    public int maxProfit(int[] prices) {

        //creates and initializes variables
        int buyIdx = 0;
        int sellIdx = 1;
        int maxSellIdx = -1;
        int maxProfit = 0;
        int sellCount = 0;

        //iterates through the prices array
        while(sellIdx < prices.length && sellCount < 2) {

            if(prices[buyIdx] < prices[sellIdx]) {

                if(maxSellIdx != -1) {
                    maxProfit += Math.max(prices[sellIdx] - prices[buyIdx], prices[maxSellIdx] - prices[buyIdx]);
                    buyIdx = sellIdx;
                    maxSellIdx = -1;
                    ++sellCount;
                } else {
                    maxSellIdx = sellIdx;
                }
            }
            else {
                buyIdx = sellIdx;
            }

            //ensures that we evaluate every sell price regardless of conditions above
            ++sellIdx;
        }

        return maxProfit;
    }
}
