public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //prints nums1 array before modification step
        //System.out.println("currIdx: " + currIdx);
        System.out.print("nums1 before: ");
        printArray(nums1);
        System.out.print("nums2 before: ");
        printArray(nums2);

        //prints nums1 array after modification step
        System.out.print("nums1 after: ");
        printArray(nums1);
        System.out.print("nums2 after: ");
        printArray(nums2);
        System.out.println(" ");

        //prints final results
        System.out.println("Final nums1 result: ");
        printArray(nums1);
        System.out.println(" ");

        System.out.println("End of Merge Function.");
    }

    //helps print out array elements in a readable format
    private void printArray(int[] array) {

        System.out.print("[ ");

        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }

}