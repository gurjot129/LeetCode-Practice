public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "()";

        //test case #2
//        String s = "()[]{}";

        //test case #3
        String s = "(]";

        boolean result = solution.isValid(s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: " + result);
    }
}