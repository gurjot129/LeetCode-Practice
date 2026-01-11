import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sOccurrence = new HashMap<>();
        HashMap<Character, Character> tOccurrence = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {

            if(sOccurrence.containsKey(s.charAt(i)) && sOccurrence.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if(sOccurrence.containsKey(s.charAt(i)) == false) {
                sOccurrence.put(s.charAt(i), t.charAt(i));
            }

            if(tOccurrence.containsKey(t.charAt(i)) && tOccurrence.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else if(tOccurrence.containsKey(t.charAt(i)) == false) {
                tOccurrence.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }
}
