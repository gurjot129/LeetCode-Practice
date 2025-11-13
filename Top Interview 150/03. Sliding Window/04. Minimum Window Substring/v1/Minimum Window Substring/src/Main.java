//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = solution.minWindow(s, t);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Minimum window substring in s: ");
        System.out.println(result);
    }
}