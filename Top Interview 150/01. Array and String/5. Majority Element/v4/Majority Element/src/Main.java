
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #2
        int[] nums = { 2,2,1,1,1,2,2 };

        int k = s.majorityElement(nums);

        System.out.println("Final Results:");
        System.out.println("k: " + k);
    }
}