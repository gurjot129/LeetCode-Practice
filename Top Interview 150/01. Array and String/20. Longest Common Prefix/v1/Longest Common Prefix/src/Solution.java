public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String lcp = "";
        int smallestString = Integer.MAX_VALUE;
        int smallestStringIdx = 0;
        boolean isLongestPrefixFound = false;

        for(int i = 0; i < strs.length; ++i)
            if(strs[i].length() < smallestString) {
                smallestString = strs[i].length();
                smallestStringIdx = i;
            }

        for(int i = 0; i < strs[smallestStringIdx].length() && !isLongestPrefixFound; ++i) {

            for(int j = 1; j < strs.length; ++j)
                if(strs[j - 1].charAt(i) != strs[j].charAt(i)) isLongestPrefixFound = true;

            if(!isLongestPrefixFound) lcp += strs[0].charAt(i);
        }

        return lcp;
    }
}
