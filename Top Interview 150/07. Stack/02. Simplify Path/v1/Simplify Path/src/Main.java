public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String s = "/home/";

        //test case #2
//        String s = "/home//foo/";

        //test case #3
//        String s = "/home/user/Documents/../Pictures";

        //test case #4
//        String s = "/../";

        //test case #5
        String s = "/.../a/../b/c/../d/./";

        String result = solution.simplifyPath(s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: " + result);
    }
}