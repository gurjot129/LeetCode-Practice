import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {

        //create and initialize variables
        Set<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> arr;
        int l = 0;
        int r = 1;
        int res = 1;

        //adds all the relevant elements to Hash Set, which ensures to remove duplicates
        for(int i : nums) {
            set.add(i);
        }

        //sorts array
        arr = new ArrayList<>(set);
        arr.sort(null);

        //finds longest consecutive sequence
        while(r < arr.size()) {

            //if number is consecutive, update result, else, shift left pointer
            if(arr.get(r - 1) == (arr.get(r) - 1))
                res = Math.max(res, r - l + 1);
            else
                l = r;

            ++r;
        }

        //returns result, however, if nums array is empty, return 0
        return nums.length == 0 ? 0 : res;
    }
}
