import java.util.Arrays;

public class Solution {

    public int candy(int[] ratings) {

        int candies = 0;

        for(int i = 0; i < ratings.length && ratings.length > 1; ++i) {

            if(i == 0) {

                if (ratings[i] > ratings[i + 1]) {
                    candies += 2;
                } else {
                    ++candies;
                }

            } else if (i < ratings.length - 1) {

                if(ratings[i] > ratings[i - 1] && ratings[i] > ratings[i + 1]) {
                    candies += 3;
                } else if (ratings[i] > ratings[i - 1] || ratings[i] > ratings[i + 1]) {
                    candies += 2;
                } else {
                    ++candies;
                }

            } else {

                if (ratings[i] > ratings[i - 1]) {
                    candies += 2;
                } else {
                    ++candies;
                }
            }

        }

        if(ratings.length == 1) candies = 1;

        return candies;
    }
}
