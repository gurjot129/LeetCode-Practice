public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String pattern = "abba";
//        String s = "dog cat cat dog";

        //test case #2
        String pattern = "abba";
        String s = "dog cat cat fish";

        boolean result = solution.wordPattern(pattern, s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}