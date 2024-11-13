public class Solution {

    public String reverseWords(String s) {

        //creates and initializes variables
        // StringBuilder is more efficient to use since it is mutable (not creating new object everytime)
        StringBuilder reversedString = new StringBuilder();
        //removes excess space from both ends of the string, and splits all the words into an array regardless of space in between
        String[] sSplit = s.trim().split("\\s+");

        //appends the words in reverse
        for(int i = sSplit.length - 1; i >= 0; --i)
            reversedString.append(sSplit[i]).append(" ");

        return reversedString.toString().trim();
    }
}
