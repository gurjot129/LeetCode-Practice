public class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder alphaNumStr = new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));

        return alphaNumStr.toString().equals(alphaNumStr.reverse().toString());
    }
}
