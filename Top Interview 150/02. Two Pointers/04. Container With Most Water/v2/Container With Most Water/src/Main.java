public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = solution.maxArea(height);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Max Area: ");
        System.out.println(result);
    }
}