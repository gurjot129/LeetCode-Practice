public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        String roman = "III";

        //test case #2
//        String roman = "LVIII";

        //test case #3
        String roman = "MCMXCIV";

        int integer = s.romanToInt(roman);

        System.out.println("Final Results:");
        System.out.println("Integer Value: " + integer);

    }
}