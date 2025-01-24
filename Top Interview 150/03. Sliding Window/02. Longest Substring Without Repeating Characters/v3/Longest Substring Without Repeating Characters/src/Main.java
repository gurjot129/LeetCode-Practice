public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "abcabcbb";

        //test case #408
        String s = "dvdf";

        int result = solution.lengthOfLongestSubstring(s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Longest Substring Without Repeating Characters: ");
        System.out.println(result);
    }
}