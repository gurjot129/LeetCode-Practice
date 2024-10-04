public class Solution {

    public int maxProfit(int[] prices) {

        //creates and initializes variables
        int buy = prices[0];
        int buyIdx = 0;
        int sell = 0;

        //this code helps find the best time to buy
        for(int i = 1; i < prices.length - 1; ++i) {
            if(prices[i] < buy) {
               buy = prices[i];
               buyIdx = i;
            }
        }

        sell = buy;

        //this code helps find the best time to sell
        for(int i = buyIdx + 1; i < prices.length; ++i) {
            if(prices[i] > sell) {
                sell = prices[i];
            }
        }

        return (sell - buy) < 0 ? 0 : sell - buy;
    }
}
