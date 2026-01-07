import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        String ransomNote = "a";
        String magazine = "b";

        boolean result = solution.canConstruct(ransomNote, magazine);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}