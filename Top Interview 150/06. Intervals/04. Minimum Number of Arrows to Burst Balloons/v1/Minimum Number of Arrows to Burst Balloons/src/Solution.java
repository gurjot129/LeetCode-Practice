import java.util.Arrays;

class Solution {

    public int findMinArrowShots(int[][] points) {

        //checks for edge cases
        if (points == null || points.length == 0) {
            return 0;
        }

        //sorts the array to aligns balloons, in order to pop balloons with min number of arrows
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;

        //starts the 1st arrow from the end point of the balloon
        int arrowPos = points[0][1];

        //checks if arrow intersects multiple balloons, otherwise, another arrow is needed
        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1];
            }
        }

        return arrows;
    }
}