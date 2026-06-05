import java.util.ArrayList;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        //creates and initializes variables
        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0; i < intervals.length; ++i) {

            if(newInterval[1] < intervals[i][0]) {

                result.add(newInterval);

                for(int j = i; j < intervals.length; ++j)
                    result.add(intervals[j]);

                return result.toArray(new int[0][]);

            } else if(newInterval[0] > intervals[i][1]) {
                result.add(intervals[i]);

            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[0][]);
    }
}
