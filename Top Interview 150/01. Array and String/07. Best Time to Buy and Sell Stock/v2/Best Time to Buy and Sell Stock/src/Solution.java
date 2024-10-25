public class Solution {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; ++i) {

            if(prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > maxProfit) {
                maxProfit = Math.max(prices[i] - buy, maxProfit);
            }
        }

        return maxProfit;
    }
}
