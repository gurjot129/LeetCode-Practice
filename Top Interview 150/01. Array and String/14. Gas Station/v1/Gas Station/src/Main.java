public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] gas = { 1,2,3,4,5 };
        int[] cost = { 3,4,5,1,2 };

        int startGasStn = s.canCompleteCircuit(gas, cost);

        System.out.println("Final Results:");
        System.out.println("Starting Gas Station: " + startGasStn);

    }
}