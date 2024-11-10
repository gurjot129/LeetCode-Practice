public class Solution {

    public int lengthOfLastWord(String s) {

        //removes all trailing spaces from the beginning and end of a sentence
        s = s.trim();

        //calculates the length of last word by finding index of  the last space, and subtracting it by the sentence length
        return s.length() - 1 - s.lastIndexOf(" ");
    }
}
