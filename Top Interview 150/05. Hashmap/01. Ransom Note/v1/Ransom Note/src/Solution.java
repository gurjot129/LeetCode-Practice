import java.util.HashMap;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        //creates and initializes variables
        HashMap<Character, Integer> rnCount = new HashMap<>();

        //creates hashmap for ransom note
        for(char c : ransomNote.toCharArray()) {
            if(rnCount.containsKey(c)) {
                rnCount.put(c, rnCount.get(c) + 1);
            } else {
                rnCount.put(c, 1);
            }
        }

        //compares ransom note characters to the magazine array
        for(int i = 0; i < magazine.length() && !rnCount.isEmpty(); ++i) {

            char c = magazine.charAt(i);

            //if ransom note character is found in magazine, decrement value in ransom note hashmap and remove it if 0
            if(rnCount.get(c) != null) {
                rnCount.put(c, rnCount.get(c) - 1);

                if(rnCount.get(c) == 0)
                    rnCount.remove(c);
            }
        }

        //if all the ransom note characters were found in the magazine, the hashmap should be empty and returning true
        return rnCount.isEmpty();
    }
}
