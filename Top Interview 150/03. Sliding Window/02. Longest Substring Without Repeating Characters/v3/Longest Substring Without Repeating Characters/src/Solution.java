import java.util.HashSet;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        //creates and initializes variables
        int longestSubstring = 0;
        HashSet<Character> uniqueCharSet = new HashSet<>(); //HashSet is used since duplicate values and order is not necessary, and to increase search/remove efficiency
        int lPtr = 0;

        //iterates through the s string character values
        for(int rPtr = 0; rPtr < s.length(); ++rPtr) {

            //as long as a duplicate exists in the HashSet, it keeps removing characters from the left, and shifts the left pointer forward
            while(uniqueCharSet.contains(s.charAt(rPtr))) {
                uniqueCharSet.remove(s.charAt(lPtr));
                ++lPtr;
            }

            //adds a character to the set
            uniqueCharSet.add(s.charAt(rPtr));

            //recalculates longest substring length
            longestSubstring = Math.max(longestSubstring, rPtr - lPtr + 1);
        }

        return longestSubstring;
    }
}
