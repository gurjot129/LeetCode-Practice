import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {

        //creates and initializes variables
        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> tCharacters = new HashMap<>();
        String minWindowSize = "";

        if(s.isEmpty() || t.isEmpty() || n > m)
            return "";

        //counts the number of characters in t string
        for(int i = 0; i < t.length(); ++i) {

            if(tCharacters.containsKey(t.charAt(i)))
                tCharacters.put(t.charAt(i), tCharacters.get(t.charAt(i)) + 1);
            else
                tCharacters.put(t.charAt(i), 1);
        }

        //
        for(int lPtr = 0; lPtr < s.length(); ++lPtr) {

            int rPtr = lPtr;
            HashMap<Character, Integer> charCheck = new HashMap<>(tCharacters);

            while(rPtr < s.length()) {

                if( tCharacters.containsKey(s.charAt(rPtr)) ) {

                    if( charCheck.containsKey(s.charAt(rPtr)) ) {

                        if(charCheck.get(s.charAt(rPtr)) > 0) {
                            charCheck.put(s.charAt(rPtr), charCheck.get(s.charAt(rPtr)) - 1);

                            if(charCheck.get(s.charAt(rPtr)) == 0) {
                                charCheck.remove(s.charAt(rPtr));
                            }
                        }

                    } else
                        break;
                }

                if(charCheck.isEmpty()) {

                    if(minWindowSize.isEmpty()) {
                        minWindowSize = s.substring(lPtr, rPtr + 1);
                    }
                    else if(s.substring(lPtr, rPtr + 1).length() < minWindowSize.length()) {
                        minWindowSize = s.substring(lPtr, rPtr + 1);
                    }

                    break;
                }

                ++rPtr;
            }
        }

        return minWindowSize;
    }
}
