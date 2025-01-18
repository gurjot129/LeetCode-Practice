import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length; ++i) {

            int lPtr = i + 1;

            while(lPtr < nums.length - 1) {

                int rPtr = lPtr + 1;

                while(rPtr < nums.length) {
                    if(nums[i] + nums[lPtr] + nums[rPtr] == 0) {

                        System.out.println("POTENTIAL SET: " + Arrays.asList(nums[i], nums[lPtr], nums[rPtr]));

                        boolean isDistinct = true;

                        for(List<Integer> r : res) {

                            List<Integer> c = Arrays.asList(nums[i], nums[lPtr], nums[rPtr]);

                            r.sort(null);
                            c.sort(null);

                            if(r.get(0) == c.get(0) && r.get(1) == c.get(1) && r.get(2) == c.get(2)) {
                                isDistinct = false;
                                break;
                            }
                        }

                        if(isDistinct)
                            res.add(Arrays.asList(nums[i], nums[lPtr], nums[rPtr]));
                    }

                    ++rPtr;
                }

                ++lPtr;
            }

        }

        return res;
    }
}
