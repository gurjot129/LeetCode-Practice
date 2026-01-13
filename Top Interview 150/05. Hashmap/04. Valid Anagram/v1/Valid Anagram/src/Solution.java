import java.util.HashMap;

public class Solution {

    public boolean isAnagram(String s, String t) {

        //ensures that both strings are the same length
        if(s.length() != t.length())
            return false;

        //creates and initializes variables
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        //splits string character into char array
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        //appends char values into tree map
        for(int i = 0; i < s.length(); ++i) {
            sMap.put(sArray[i], sMap.getOrDefault(sArray[i], 0) + 1);
            tMap.put(tArray[i], tMap.getOrDefault(tArray[i], 0) + 1);
        }

        //returns true or false depending on if the strings are equals or not
        return sMap.equals(tMap);
    }
}
