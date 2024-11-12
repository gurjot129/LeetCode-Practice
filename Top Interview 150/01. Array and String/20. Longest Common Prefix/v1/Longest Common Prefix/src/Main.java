public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        String[] strs = { "flower","flow","flight" };

        //test case #2
//        String[] strs = { "dog","racecar","car" };

        //test case #7
        String[] strs = { "ab", "a" };

        String lcp = s.longestCommonPrefix(strs);

        System.out.println("Final Results:");
        System.out.println("Longest Common Prefix: " + lcp);


    }
}