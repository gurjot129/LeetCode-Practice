public class Solution {

    public boolean isSubsequence(String s, String t) {

        //creates and initializes variables
        int sPtr = 0;
        int tPtr = 0;

        //iterates through each of the string character until we reach the end of the array for either string values
        while(sPtr < s.length() && tPtr < t.length()) {

            //if a character matches from both values, increment the s pointer
            if(s.charAt(sPtr) == t.charAt(tPtr))  ++sPtr;

            ++tPtr;
        }

        return sPtr == s.length();
    }
}
