import java.util.HashMap;

public class Solution {

    public boolean wordPattern(String pattern, String s) {

        //creates and initializes variables
        HashMap<Character, String> psSet = new HashMap<>();
        HashMap<String, Character> spSet = new HashMap<>();

        char[] pChars = new char[s.length()];
        String[] sArray = s.split(" ");

        for(int i = 0; i < pattern.length(); ++i) {
            pChars[i] = pattern.charAt(i);
        }

        for(int i = 0; i < pChars.length; ++i) {

            if(psSet.containsKey(pChars[i]) && !psSet.get(pChars[i]).equals(sArray[i]) ) {
                return false;
            } else if (spSet.containsKey(sArray[i]) && !spSet.get(sArray[i]).equals(pChars[i]) ) {
                return false;
            }

            psSet.put(pChars[i], sArray[i]);
            spSet.put(sArray[i], pChars[i]);
        }

        return true;
    }
}
