public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        int[] prices = { 7,1,5,3,6,4 };

        //test case #155
//        int[] prices = { 2,4,1 };

        //test case #179
        int[] prices = { 3,2,6,5,0,3 };

        int profit = s.maxProfit(prices);

        System.out.println("Final Results:");
        System.out.println("profit: " + profit);
    }
}