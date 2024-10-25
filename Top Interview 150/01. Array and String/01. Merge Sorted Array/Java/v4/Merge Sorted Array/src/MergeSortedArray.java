public class MergeSortedArray {

    //This method uses two pointer method
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //creates and initializes variables to keep track of elements from nums1 and nums2 array
        int nums1Idx = m - 1;
        int nums2Idx = n - 1;
        int currIdx = m + n - 1;

        //iterates through arrays until we reach passed the last nums2 array index
        while(nums2Idx >= 0) {

            //prints nums1 array before modification step
            System.out.println("currIdx: " + currIdx);
            System.out.print("nums1 before: ");
            printArray(nums1);
            System.out.print("nums2 before: ");
            printArray(nums2);

            //Analyzes which element is bigger from each array, and sorts it in descending order
            if(nums1Idx >= 0 && nums1[nums1Idx] >= nums2[nums2Idx]) {
                nums1[currIdx] = nums1[nums1Idx];
                --nums1Idx;
            } else {
                nums1[currIdx] = nums2[nums2Idx];
                --nums2Idx;
            }

            //prints nums1 array after modification step
            System.out.print("nums1 after: ");
            printArray(nums1);
            System.out.print("nums2 after: ");
            printArray(nums2);
            System.out.println(" ");

            --currIdx;
        }

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