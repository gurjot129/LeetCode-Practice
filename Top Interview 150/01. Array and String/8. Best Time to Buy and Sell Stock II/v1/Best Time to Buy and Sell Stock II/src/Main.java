
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        int[] prices = { 7,1,5,3,6,4 };

        //test case #2
        int[] prices = { 1,2,3,4,5 };

        //test case #3
//        int[] prices = { 7,6,4,3,1 };

        int profit = s.maxProfit(prices);

        System.out.println("Final Results:");
        System.out.println("profit: " + profit);

    }
}