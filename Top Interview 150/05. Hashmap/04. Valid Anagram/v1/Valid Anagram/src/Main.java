public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "anagram";
//        String t = "nagaram";

        //test case #50
        String s = "aacc";
        String t = "ccac";

        boolean result = solution.isAnagram(s, t);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}