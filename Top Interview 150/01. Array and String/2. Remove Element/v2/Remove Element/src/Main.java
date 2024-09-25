public class Main {
    public static void main(String[] args) {

        RemoveElement re = new RemoveElement();

        //test case #1
//        int[] nums = { 3,2,2,3 };
//        int val = 3;

        //test case #2
//        int[] nums = { 0,1,2,2,3,0,4,2 };
//        int val = 2;

        //test case #43
        int[] nums = { 2,2,3 };
        int val = 4;

        int k = re.removeElement(nums, val);
    }
}