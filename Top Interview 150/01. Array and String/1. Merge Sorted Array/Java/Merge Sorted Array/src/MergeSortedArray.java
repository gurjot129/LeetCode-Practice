public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //keeps track of which elements we are comparing
        int nums1Idx = m - 1;
        int nums2Idx = nums2.length - 1;
        int currIdx = nums1.length - 1;

        //helps with sorting nums1 array
        while(currIdx >= 0) {

            System.out.println("currIdx: " + currIdx);
            System.out.print("Before: ");
            printArray(nums1);

            if(nums2Idx >= 0 && nums2[nums2Idx] >= nums1[nums1Idx]) {
                nums1[currIdx] = nums2[nums2Idx];
                --nums2Idx;
                --currIdx;
            } else {
                nums1[currIdx] = nums1[nums1Idx];
                --nums1Idx;
                --currIdx;
            }

            System.out.print("After: ");
            printArray(nums1);
            System.out.println("");

        }

        System.out.println("End of Merge Function.");
    }

    private void printArray(int[] array) {

        System.out.print("[ ");

        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }

}




//            //compare values in the nums2 array
//            if(nums2Idx >= 0 && nums2[nums2Idx] == 0) {
//                --nums2Idx;
//            } else if(nums2Idx >= 0) {
//
//            }
//
//            //compare values in the nums1 array
//            if(nums1Idx >= 0 && nums1[nums1Idx] == 0) {
//                --nums1Idx;
//            } else if(nums1Idx >= 0) {
//
//            }
