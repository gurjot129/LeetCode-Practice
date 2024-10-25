public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        //creating and initializing variables
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int midIdx = rightIdx / 2;

        int[] keepIdx = new int[nums.length];
        int k = 0;

        if(nums.length != 0) {

            //iterates through nums array in order to remove unwanted values and keep track of the remaining values
            while(leftIdx <= midIdx) {

                System.out.println("leftIdx: " + leftIdx);
                System.out.println("rightIdx: " + rightIdx);
                System.out.print("nums before: ");
                printArray(nums);
                System.out.println("k before: " + k);
                System.out.print("keepIdx before: ");
                printArray(keepIdx);
                System.out.println(" ");

                //if the left and right indices equal to each, only use the left side logic to avoid working on the same index twice
                if(leftIdx != rightIdx) {

                    //this logic analyzes array starting from the left side
                    if(nums[leftIdx] == val) {
                        nums[leftIdx] = -1;
                    } else {
                        keepIdx[k] = leftIdx;
                        ++k;
                    }
                    ++leftIdx;

                    //this logic analyzes array starting from the right side
                    if(nums[rightIdx] == val) {
                        nums[rightIdx] = -1;
                    } else {
                        keepIdx[k] = rightIdx;
                        ++k;
                    }
                    --rightIdx;

                } else {

                    if(nums[leftIdx] == val) {
                        nums[leftIdx] = -1;
                    } else {
                        keepIdx[k] = leftIdx;
                        ++k;
                    }
                    ++leftIdx;
                }

                System.out.print("nums after: ");
                printArray(nums);
                System.out.println("k after: " + k);
                System.out.print("keepIdx after: ");
                printArray(keepIdx);
                System.out.println(" ");
            }

            //place the remaining elements on the left side of the array
            for(int i = 0; i < k; ++i) {
                nums[i] = nums[keepIdx[i]];
            }
        }

        System.out.println("Final Results");
        System.out.print("nums: ");
        printArray(nums);
        System.out.println("k: " + k);

        return k;
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
