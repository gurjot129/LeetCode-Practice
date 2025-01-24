import java.util.HashSet;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        //creates and initializes variables
        HashSet<Character> uniqueCharSet = new HashSet<>();
        int longestSubstring = 0;

        //this checks if the string is null or empty, if not, the first element is processed
        if(!s.isEmpty() && s != "") {
            uniqueCharSet.add(s.charAt(0));
            longestSubstring = 1;
        }

        //iterates through string s characters
        for(int i = 1; i < s.length(); ++i) {

            //if there is a duplicate, we clear and start the sequence again
            if(uniqueCharSet.contains(s.charAt(i)))
                uniqueCharSet.clear();

            //adds the unique value to the HashSet and recalculates the longest substring
            uniqueCharSet.add(s.charAt(i));
            longestSubstring = Math.max(longestSubstring, uniqueCharSet.size());
        }

        return longestSubstring;
    }
}
