public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String[] strs = { "flower","flow","flight" };

        String lcp = s.longestCommonPrefix(strs);

        System.out.println("Final Results:");
        System.out.println("Longest Common Prefix: " + lcp);


    }
}