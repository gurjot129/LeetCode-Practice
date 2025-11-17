import java.util.HashMap;

public class Solution {

    public String minWindow(String s, String t) {

        //base case
        if(t == "")
            return "";

        //creates and initializes variables
        HashMap<Character, Integer> tCount = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = 0;
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int lPtr = 0;
        int rPtr = 0;

        //counts the number of characters in t
        for (char c : t.toCharArray())
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);

        //updates need variable in order to check whether if window result is satisfied
        need = tCount.size();

        for(rPtr = 0; rPtr < s.length(); ++rPtr) {

            //retrieves character and adds it to the window
            char c = s.charAt(rPtr);
            window.put(c, window.getOrDefault(c, 0) + 1);

            //keeps track of which relevant values are found and used for comparing to need variable
            if(tCount.containsKey(c) && window.get(c) == tCount.get(c))
                ++have;

            //adjusts windows according to the have and need variables
            while(have == need) {

                //updates window size
                if((rPtr - lPtr + 1) < resLen) {
                    res[0] = lPtr;
                    res[1] = rPtr;
                    resLen = rPtr - lPtr + 1;
                }

                //decreases window size
                window.put(s.charAt(lPtr), window.get(s.charAt(lPtr)) - 1);

                //updates have variable
                if(tCount.containsKey(s.charAt(lPtr)) && (window.get(s.charAt(lPtr)) < tCount.get(s.charAt(lPtr))))
                    --have;

                //shift left pointer since we removed the value from the left side of the array
                ++lPtr;
            }
        }

        //if appropriate result length is found, return result, else return empty string
        return resLen != Integer.MAX_VALUE ? s.substring(res[0] , res[1] + 1) : "";
    }
}
