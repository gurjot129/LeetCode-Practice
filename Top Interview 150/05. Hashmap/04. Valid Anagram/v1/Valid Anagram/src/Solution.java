import java.util.TreeMap;

public class Solution {

    public boolean isAnagram(String s, String t) {

        //ensures that both strings are the same length
        if(s.length() != t.length())
            return false;

        //creates and initializes variables
        TreeMap<Character, Integer> sMap = new TreeMap<>();
        TreeMap<Character, Integer> tMap = new TreeMap<>();

        //splits string character into char array
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        //appends char values into tree map
        for(int i = 0; i < s.length(); ++i) {
            sMap.put(sArray[i], 0);
            tMap.put(tArray[i], 0);
        }

        //returns true or false depending on if the strings are equals or not
        return sMap.equals(tMap);
    }
}
