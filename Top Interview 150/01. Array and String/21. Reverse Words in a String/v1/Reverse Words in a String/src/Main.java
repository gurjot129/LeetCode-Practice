public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String string = "the sky is blue";

        String reversedString = s.reverseWords(string);

        System.out.println("Final Results:");
        System.out.println("Reversed words in a String: " + reversedString);

    }
}