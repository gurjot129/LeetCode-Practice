public class Solution {

    public int candy(int[] ratings) {

        //creates and initializes variables
        int[] candies = new int[ratings.length];
        int candySum = 0;

        //all children at least have 1 candy
        for(int i = 0; i < candies.length; ++i)
            candies[i] = 1;

        //comparing ratings from left to right
        for(int i = 1; i < ratings.length; ++i)
            if(ratings[i - 1] < ratings[i]) candies[i] = candies[i - 1] + 1;

        //comparing ratings from right to left
        for(int i = ratings.length - 2; i >= 0; --i)
            if(ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);

        for(int i : candies) candySum += i;

        return candySum;
    }
}
