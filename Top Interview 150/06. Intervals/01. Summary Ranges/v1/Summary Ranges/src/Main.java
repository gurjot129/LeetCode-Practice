import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        // int[] nums = { 0,1,2,4,5,7 };

        //test case #2
        int[] nums = { 0,2,3,4,6,8,9 };

        List<String> result = solution.summaryRanges(nums);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}