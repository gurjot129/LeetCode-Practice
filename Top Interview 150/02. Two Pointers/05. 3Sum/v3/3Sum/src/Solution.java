import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; ++i) {

            int lPtr = i + 1;
            int rPtr = nums.length - 1;

            while(lPtr < rPtr ) {

                if(nums[i] + nums[lPtr] + nums[rPtr] == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[lPtr], nums[rPtr]);
                    list.sort(null);
                    res.add(list);
                }

                if(nums[i] + nums[lPtr] + nums[rPtr] < 0)
                    ++lPtr;
                else
                    --rPtr;
            }
        }

        return res.stream().toList();
    }
}
