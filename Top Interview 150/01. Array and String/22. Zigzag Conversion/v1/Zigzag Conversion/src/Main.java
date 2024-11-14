public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String string = "PAYPALISHIRING";
        int numRows = 3;

        //test case #2
//        String string = "PAYPALISHIRING";
//        int numRows = 4;

        String zigzag = s.convert(string, numRows);

        System.out.println("Final Results:");
        System.out.println("ZigZag Conversion: " + zigzag);

    }
}