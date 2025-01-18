import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length; ++i) {

            int lPtr = i + 1;

            while(lPtr < nums.length - 1) {

                int rPtr = lPtr + 1;

                while(rPtr < nums.length) {
                    if(nums[i] + nums[lPtr] + nums[rPtr] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[lPtr], nums[rPtr]);
                        list.sort(null);
                        res.add(list);
                    }

                    ++rPtr;
                }

                ++lPtr;
            }

        }

        return res.stream().toList();
    }
}
