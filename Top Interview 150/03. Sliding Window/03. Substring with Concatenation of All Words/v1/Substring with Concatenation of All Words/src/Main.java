import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        List<Integer> result = solution.findSubstring(s, words);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Starting indices of all the concatenated substrings in s: ");
        System.out.println(result);
    }
}