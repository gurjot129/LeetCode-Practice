import java.util.HashSet;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        //creates and initializes variables
        int longestSubstring = 0;
        HashSet<Character> uniqueCharSet = new HashSet<>(); //HashSet is used since duplicate values and order is not necessary, and to increase search/remove efficiency
        int lPtr = 0;

        //this checks if the string is null or empty, if not, the first element is processed
        if(s != null && !s.isEmpty()) {
            uniqueCharSet.add(s.charAt(0));
            longestSubstring = 1;
        }

        //iterates through the s string character values
        for(int rPtr = 1; rPtr < s.length(); ++rPtr) {

            //this statement checks for duplicates
            //if the current value isn't unique, the left pointer moves one step ahead of the duplicate value to readjust substring length
            //if the current value is unique it is added to the HashSet
            if(uniqueCharSet.contains(s.charAt(rPtr))) {

                boolean isDupFound = false;

                //moves the left pointer forward until the duplicate value is found while removing
                //the other characters from the HashSet before the duplicate value
                while(lPtr <= rPtr && !isDupFound) {
                    if (s.charAt(lPtr) == s.charAt(rPtr))
                        isDupFound = true;
                    else
                        uniqueCharSet.remove(s.charAt(lPtr));
                    ++lPtr;
                }

            } else {
                uniqueCharSet.add(s.charAt(rPtr));
            }

            //recalculates substring length
            longestSubstring = Math.max(longestSubstring, rPtr - lPtr + 1);
        }

        return longestSubstring;
    }
}
