public class Main {

    public static void main(String[] args) {

        //Test Case 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;


        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m,  nums2, n);

        System.out.println("End of Main Function.");
    }
}