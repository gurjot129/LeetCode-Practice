public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        String s = "abc";
        String t = "ahbgdc";

        boolean result = solution.isSubsequence(s, t);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Is Palindrome: ");
        System.out.println(result);
    }
}