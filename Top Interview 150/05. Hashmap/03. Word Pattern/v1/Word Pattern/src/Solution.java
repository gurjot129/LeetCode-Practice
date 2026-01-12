import java.util.HashMap;

public class Solution {

    public boolean wordPattern(String pattern, String s) {

        //the length of the pattern and s must be equal, otherwise return false
        if(pattern.length() != s.split(" ").length)
            return false;

        //creates and initializes variables
        HashMap<Character, String> psSet = new HashMap<>();
        HashMap<String, Character> spSet = new HashMap<>();

        //split the pattern and s into arrays
        String[] sArray = s.split(" ");
        char[] pChars = pattern.toCharArray();

        //iterates through the pattern and s array, in order to evaluate the word pattern
        for(int i = 0; i < pChars.length; ++i) {

            //p element is present, but doesn't match the current s element's value, return false
            if(psSet.containsKey(pChars[i]) && !psSet.get(pChars[i]).equals(sArray[i]) ) {
                return false;

            //s element is present, but doesn't match the current p element's value, return false
            } else if (spSet.containsKey(sArray[i]) && !spSet.get(sArray[i]).equals(pChars[i]) ) {
                return false;
            }

            //since KV pair doesn't exist, append KV pair
            psSet.put(pChars[i], sArray[i]);
            spSet.put(sArray[i], pChars[i]);
        }

        return true;
    }
}
