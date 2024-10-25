public class Solution {

    public int maxProfit(int[] prices) {

        //creates and initializes variables
        int buyIdx = 0;
        int sellIdx = 1;
        int maxProfit = 0;

        //iterates through the prices array
        while(sellIdx < prices.length) {

            //if buy price is less than sell price, check if the profit is more than max profit
            //if buy price is greater than sell price (sell is less than buy),
            //make that sell price the new buy price (lower buy price is better)
            if(prices[buyIdx] < prices[sellIdx])
                maxProfit = Math.max(maxProfit, prices[sellIdx] - prices[buyIdx]);
            else
                buyIdx = sellIdx;

            //ensures that we evaluate every sell price regardless of conditions above
            ++sellIdx;
        }

        return maxProfit;
    }
}
