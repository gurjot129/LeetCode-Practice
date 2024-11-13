public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String string = "PAYPALISHIRING";

        int zigzag = s.convert(string);

        System.out.println("Final Results:");
        System.out.println("ZigZag Conversion: " + zigzag);

    }
}