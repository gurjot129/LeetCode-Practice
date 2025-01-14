
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        String str = "A man, a plan, a canal: Panama";

        //test case #2
        String str = "ab_a";

        boolean result = s.isPalindrome(str);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Is Palindrome: ");
        System.out.println(result);
    }
}