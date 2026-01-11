import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> charOccurrences = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {

            if(charOccurrences.containsKey(s.charAt(i)) && charOccurrences.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if(charOccurrences.containsKey(s.charAt(i)) == false) {
                charOccurrences.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
