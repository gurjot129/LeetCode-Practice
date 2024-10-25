public class Solution {

    public int maxProfit(int[] prices) {

        //creates and initializes variables
        int maxProfits = 0;

        //iterates through the prices array
        for(int i = 1; i < prices.length; ++i) {

            //if the sell stock is greater than the buy stock, add the difference to the maxProfits
            if(prices[i] > prices[i - 1]) {
                maxProfits += (prices[i] - prices[i - 1]);
            }
        }

        return maxProfits;
    }
}
