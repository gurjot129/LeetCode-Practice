import java.util.Arrays;

public class Solution {

    public int hIndex(int[] citations) {

        int hIndex = 0;

        Arrays.sort(citations);

        for(int i = 1; i <= citations.length; ++i) {

            int citPapEq = 0;

            for(int j = 0; j < citations.length && citPapEq != i; ++j) {
                if(citations[j] >= i) ++citPapEq;
            }

            if(citPapEq == i) ++hIndex;
        }

        return hIndex;
    }

}
