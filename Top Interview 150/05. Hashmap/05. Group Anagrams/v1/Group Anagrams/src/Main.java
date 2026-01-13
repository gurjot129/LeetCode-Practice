import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = solution.groupAnagrams(strs);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}