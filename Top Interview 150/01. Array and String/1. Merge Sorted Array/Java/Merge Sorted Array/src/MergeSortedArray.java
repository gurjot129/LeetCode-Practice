public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //keeps track of which elements we are comparing
        int nums1Idx = m - 1;
        int nums2Idx = nums2.length - 1;
        int currIdx = nums1.length - 1;

        //checks if nums2 is empty
        if(nums2.length != 0) {

            //ensures that the nums1 index value initially isn't negative
            if(nums1Idx < 0) {
                nums1Idx = 0;
            }

            //helps with sorting nums1 array
            while(currIdx >= 0) {

                System.out.println("currIdx: " + currIdx);
                System.out.print("nums1 before: ");
                printArray(nums1);
                System.out.print("nums2 before: ");
                printArray(nums2);

                //decides which element is larger from each of the arrays, largest one is then inserted at the current index
                if(nums2Idx >= 0 && nums2[nums2Idx] >= nums1[nums1Idx]) {
                    nums1[currIdx] = nums2[nums2Idx];
                    --nums2Idx;
                    --currIdx;
                } else {
                    nums1[currIdx] = nums1[nums1Idx];
                    --nums1Idx;
                    --currIdx;
                }

                System.out.print("nums1 after: ");
                printArray(nums1);
                System.out.print("nums2 after: ");
                printArray(nums2);
                System.out.println(" ");

            }
        }

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