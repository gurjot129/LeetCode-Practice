public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String haystack = "sadbutsad", needle = "sad";

        int result = s.strStr(haystack, needle);

        System.out.println("Final Results:");
        System.out.println("Index of the First Occurrence in a String: " + result);

    }
}