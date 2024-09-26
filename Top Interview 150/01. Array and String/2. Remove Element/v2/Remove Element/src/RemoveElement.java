public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        //creating and initializing variables
        int k = 0;

        //ensures that the array isn't empty
        if(nums.length != 0) {

            //iterates through nums array in order to remove unwanted values and keep track of the remaining values
            for(int i = 0; i < nums.length; ++i) {

                System.out.println("i: " + i);
                System.out.print("nums before: ");
                printArray(nums);
                System.out.println("k before: " + k);
                System.out.println(" ");

                //this logic analyzes array, decides which elements to remove or keep, and it moves remaining the beginning of the array,
                if(nums[i] == val) {
                    nums[i] = -1;
                } else {
                    nums[k] = nums[i];
                    ++k;
                }

                System.out.print("nums after: ");
                printArray(nums);
                System.out.println("k after: " + k);
                System.out.println(" ");
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
