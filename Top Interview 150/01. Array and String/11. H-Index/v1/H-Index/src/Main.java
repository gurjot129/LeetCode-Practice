public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] citations = { 3,0,6,1,5 };

        int hIndex = s.hIndex(citations);

        System.out.println("Final Results:");
        System.out.println("H-Index: " + hIndex);

    }
}