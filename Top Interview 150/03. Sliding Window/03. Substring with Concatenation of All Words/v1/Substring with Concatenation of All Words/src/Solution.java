import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {

        //creates and initializes variables
        List<Integer> startingIndices = new ArrayList<Integer>();

        if(s != null && !s.isEmpty()) {

            for(int i = 0; i < s.length() && (i + words[0].length() - 1) < s.length(); ++i) {

                int lPtr = i;
                int rPtr = lPtr + words[0].length() - 1;

                List<String> wordList = new ArrayList<String>(Arrays.asList(words));

                for(int j = 0; j < words.length && rPtr < s.length(); ++j) {

                    //debugging purposes
                    String substrTest = s.substring(lPtr, rPtr + 1);
                    boolean equalsTest = wordList.contains(s.substring(lPtr, rPtr + 1));

                    if(wordList.contains(s.substring(lPtr, rPtr + 1))) {

                        wordList.remove(s.substring(lPtr, rPtr + 1));

                        lPtr += words[0].length();
                        rPtr += words[0].length();

                    } else {
                        break;
                    }
                }

                if(wordList.isEmpty()) {
                    startingIndices.add(i);
                }
            }
        }

        return startingIndices;
    }
}
