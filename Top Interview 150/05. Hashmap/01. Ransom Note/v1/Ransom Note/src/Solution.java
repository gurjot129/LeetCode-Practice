import java.util.HashMap;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> rnCount = new HashMap<>();

        for(char c : ransomNote.toCharArray()) {
            if(rnCount.get(c) == null) {
                rnCount.put(c, 1);
            } else {
                rnCount.put(c, rnCount.get(c) + 1);
            }
        }

        for(int i = 0; i < magazine.length() && !rnCount.isEmpty(); ++i) {

            char c = magazine.charAt(i);

            if(rnCount.get(c) != null) {
                rnCount.put(c, rnCount.get(c) - 1);

                if(rnCount.get(c) == 0)
                    rnCount.remove(c);
            }
        }

        return rnCount.isEmpty();
    }
}
