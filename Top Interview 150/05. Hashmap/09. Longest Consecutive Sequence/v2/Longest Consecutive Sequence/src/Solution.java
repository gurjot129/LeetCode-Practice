import java.util.HashSet;

public class Solution {

    public int longestConsecutive(int[] nums) {

        //creates and initializes variables
        HashSet<Integer> numsSet = new HashSet<Integer>();
        int res = 0;

        //copy nums elements to set in order to remove duplicates and to quickly find values
        for(int i : nums)
            numsSet.add(i);

        //find longest consecutive sequence
        for(int i : numsSet) {

            //stores potential start of the consecutive number
            int currNum = i;

            //if there is no value before the current number, let this be the starting number
            if(!numsSet.contains(currNum - 1)) {

                int currConsecSeqLen = 1;
                res = Math.max(currConsecSeqLen, res);

                //increments result length when next consecutive value is found
                while(numsSet.contains(currNum + 1)) {
                    res = Math.max(++currConsecSeqLen, res);
                    ++currNum;
                }
            }

        }

        return res;
    }
}
