class Solution {

    public int[][] merge(int[][] intervals) {

        //creates and initializes variables
        int[] currInterval = intervals[0];
        int[][] result = new int[intervals.length][2];
        int resCnt = 0;

        //iterates through the intervals, and identifies which intervals to merge
        for(int i = 1; i < intervals.length; ++i) {

            //checks if the specific interval can be merged with the current interval
            //if so, update the current interval's end value
            //if not, add to the result array, and update the current interval with the specific interval's values

            //temp
            boolean check = currInterval[0] <= intervals[i][0] && intervals[i][0] <= currInterval[1];

            if((currInterval[0] <= intervals[i][0] && intervals[i][0] <= currInterval[1]) ||
               (currInterval[0] <= intervals[i][1] && intervals[i][1] <= currInterval[1]) ||
               (intervals[i][0] <= currInterval[0] && currInterval[0] <= intervals[i][1]) ||
               (intervals[i][0] <= currInterval[1] && currInterval[1] <= intervals[i][1])) {

                currInterval[0] = Math.min(currInterval[0], intervals[i][0]);
                currInterval[1] = Math.max(currInterval[1], intervals[i][1]);

            } else {
                result[resCnt][0] = currInterval[0];
                result[resCnt][1] = currInterval[1];
                ++resCnt;

                currInterval[0] = intervals[i][0];
                currInterval[1] = intervals[i][1];
            }
        }

        //handles last step
        result[resCnt][0] = currInterval[0];
        result[resCnt][1] = currInterval[1];
        ++resCnt;

        //ensures that the array is created with the exact size
        int[][] temp = result;

        result = new int[resCnt][2];

        for(int i = 0; i < resCnt; ++i) {
            result[i] = temp[i];
        }


        return result;
    }
}