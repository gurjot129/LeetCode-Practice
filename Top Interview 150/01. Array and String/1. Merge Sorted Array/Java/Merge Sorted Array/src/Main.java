public class Main {

    public static void main(String[] args) {

        //Test Case 1
//        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
////        int m = 3;
////        int[] nums2 = { 2, 5, 6 };
////        int n = 3;

        //Test Case 2
//        int[] nums1 = { 1 };
//        int m = 1;
//        int[] nums2 = { };
//        int n = 0;

        //Test Case 3
        int[] nums1 = { 0 };
        int m = 0;
        int[] nums2 = { 1 };
        int n = 1;

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m,  nums2, n);

        System.out.println("End of Main Function.");
    }
}