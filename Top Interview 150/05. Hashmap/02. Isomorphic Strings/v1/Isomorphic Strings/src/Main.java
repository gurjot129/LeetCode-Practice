public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "egg";
//        String t = "add";

        //test case #41
        String s = "badc";
        String t = "baba";

        boolean result = solution.isIsomorphic(s, t);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}