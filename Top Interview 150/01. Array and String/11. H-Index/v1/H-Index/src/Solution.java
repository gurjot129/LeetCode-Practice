public class Solution {

    public int hIndex(int[] citations) {

        //creates and initializes variables
        int hIndex = 0;

        //this iterates through the number of papers
        for(int i = 1; i <= citations.length; ++i) {

            //counts how many minimum number of citations per paper match equal or greater to the number of papers
            int citPapEq = 0;

            //evaluates the number of citations per paper in order to identity which
            //papers' citations match equal or greater to the number of papers
            for(int j = 0; j < citations.length && citPapEq != i; ++j) {
                if(citations[j] >= i) ++citPapEq;
            }

            //if the required number of papers is met, increment H-Index value
            if(citPapEq == i) ++hIndex;
        }

        return hIndex;
    }

}
