import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinWorkerThread;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {

        //creates and initializes variables
        List<Integer> startingIndices = new ArrayList<Integer>();

        if(s != null && !s.isEmpty()) {

            List<Integer> wordsFoundIdcs = new ArrayList<Integer>();
            List<String> wordList = new ArrayList<String>(Arrays.asList(words));

            for(int i = 0; i < (s.length() - (words[0].length() * words.length)); ++i) {

                int lPtr = i;
                int rPtr = lPtr + words[0].length() - 1;

                for(int j = 0; j < words.length; ++j) {

                    

                    if(wordList.contains(s.substring(lPtr, rPtr + 1))) {

                        wordList.remove(s.substring(lPtr, rPtr + 1));

                        lPtr += words[0].length();
                        rPtr += words[0].length();

                    } else {
                        break;
                    }
                }

                if(wordList.isEmpty()) {
                    wordsFoundIdcs.add(i);
                }
            }
        }

        return startingIndices;
    }
}
