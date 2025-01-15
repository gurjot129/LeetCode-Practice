import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int [] numbers = {2,7,11,15};
//        int target = 9;

        //test case #2
        int [] numbers = {2,3,4};
        int target = 6;

        int[] result = solution.twoSum(numbers, target);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Two Sum Indices: ");
        System.out.println(Arrays.toString(result));
    }
}