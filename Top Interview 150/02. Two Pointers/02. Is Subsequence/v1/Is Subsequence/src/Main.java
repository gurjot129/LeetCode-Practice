public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "abc";
//        String t = "ahbgdc";

        //test case #2
//        String s = "axc";
//        String t = "ahbgdc";

        //test case #3
//        String s = "";
//        String t = "ahbgdc";

        //test case #4
        String s = "acb";
        String t = "ahbgdc";

        boolean result = solution.isSubsequence(s, t);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Is Subsequence: ");
        System.out.println(result);
    }
}