public class Solution {

    public int hIndex(int[] citations) {

        //creates and initializes variables
        int count = 0;
        //create the bucket where it also includes 0 to ALL papers
        int[] buckets = new int[citations.length + 1];

        //uses bucket sort to count the occurrence of the same number of citations per paper
        for(int i = 0; i < citations.length; ++i) {

            //if the citation is within the citations array length, then use it as an index
            //if it exceeds citations array length, use citations array length as index to avoid index out of bound error
            if(citations[i] <= citations.length) {
                ++buckets[citations[i]];
            } else {
                ++buckets[citations.length];
            }
        }

        //counts the minimum number of papers that equal to the number of citations, returns it as the H-Index
        for(int i = buckets.length - 1; i >= 0; --i) {
            count += buckets[i];
            if(count >= i) return i;
        }

        return 0;
    }

}
