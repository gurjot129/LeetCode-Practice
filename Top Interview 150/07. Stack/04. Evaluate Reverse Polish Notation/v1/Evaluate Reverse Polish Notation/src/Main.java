public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        String[] s = {"2","1","+","3","*"};

        //test case #2
        String[] s = {"4","13","5","/","+"};

        int result = solution.evalRPN(s);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: " + result);
    }
}