public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        String string = "Hello World";

        //test case #2
//        String string = "   fly me   to   the moon  ";

        //test case #3
        String string = "luffy is still joyboy";

        int lastWordLength = s.lengthOfLastWord(string);

        System.out.println("Final Results:");
        System.out.println("Length of Last Word: " + lastWordLength);

    }
}