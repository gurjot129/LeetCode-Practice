public class Solution {

    public boolean isSubsequence(String s, String t) {

        //creates and initializes variables
        int lPtr = 0;
        int rPtr = 1;
        int sIdx = 0;
        boolean isFirstLetterFound = false;
        boolean isSubsequenceFound = false;

        while(lPtr < t.length() && rPtr < t.length() && !isSubsequenceFound) {

            if(!isFirstLetterFound) {

                if(t.charAt(lPtr) == s.charAt(sIdx)) {
                    isFirstLetterFound = true;
                    rPtr = lPtr + 1;
                    ++sIdx;
                } else {
                    ++lPtr;
                }

            } else {

                if(t.charAt(rPtr) == s.charAt(sIdx)) {
                    ++rPtr;
                    ++sIdx;
                } else {
                    ++rPtr;
                }
            }

            if(sIdx == s.length() - 1) {
                isSubsequenceFound = true;
            }
        }

        return isSubsequenceFound;
    }
}
