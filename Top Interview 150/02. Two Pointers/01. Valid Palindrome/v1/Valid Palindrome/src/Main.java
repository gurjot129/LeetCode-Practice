
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String str = "A man, a plan, a canal: Panama";

        boolean result = s.isPalindrome(str);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Is Palindrome: ");
        System.out.println(result);
    }
}