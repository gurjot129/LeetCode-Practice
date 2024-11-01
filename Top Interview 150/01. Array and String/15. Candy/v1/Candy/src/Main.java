public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] ratings = { 1,0,2 };

        int minCandies = s.candy(ratings);

        System.out.println("Final Results:");
        System.out.println("Minimum Candies: " + minCandies);

    }
}