public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] height = { 0,1,0,2,1,0,1,3,2,1,2,1 };

        int trappedRainWater = s.trap(height);

        System.out.println("Final Results:");
        System.out.println("Trapped Rain Water: " + trappedRainWater);

    }
}