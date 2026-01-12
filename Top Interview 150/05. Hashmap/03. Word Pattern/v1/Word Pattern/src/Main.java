public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String pattern = "abba";
//        String s = "dog cat cat dog";

        //test case #2
//        String pattern = "abba";
//        String s = "dog cat cat fish";

        //test case #20
//        String pattern = "aaa";
//        String s = "aa aa aa aa";

        //test case #43
        String pattern = "he";
        String s = "unit";

        boolean result = solution.wordPattern(pattern, s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}