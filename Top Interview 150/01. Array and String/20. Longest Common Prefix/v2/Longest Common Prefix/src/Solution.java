import java.util.Arrays;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        //creates and initializes variables
        StringBuilder lcp = new StringBuilder();

        //sorts array of strings lexicographically
        Arrays.sort(strs);

        //once sorted, only the first and last elements matter
        String firstElement = strs[0];
        String lastElement = strs[strs.length - 1];

        //evaluates the first and last string only, and finds the longest common prefix
        for(int i = 0; i < Math.min(firstElement.length(), lastElement.length()); ++i) {

            //if the characters don't match at the same index, end the loop and return the characters that do match
            if(firstElement.charAt(i) != lastElement.charAt(i))
                return lcp.toString();

            lcp.append(firstElement.charAt(i));
        }

        return lcp.toString();
    }
}
