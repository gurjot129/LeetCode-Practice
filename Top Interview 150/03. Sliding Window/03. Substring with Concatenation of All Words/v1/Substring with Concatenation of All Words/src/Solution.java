import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinWorkerThread;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {

        //creates and initializes variables
        List<Integer> startingIndices = new ArrayList<Integer>();

        if(s != null && !s.isEmpty()) {

            List<Integer> wordsFoundIdcs = new ArrayList<Integer>();

            for(int i = 0; i < (s.length() - (words[0].length() * words.length)); ++i) {

                int lPtr = i;
                int rPtr = lPtr + words[0].length() - 1;

                for(int j = 0; j < words.length; ++j) {

                    if(!wordsFoundIdcs.contains(j)) {

                        String substrTest = s.substring(lPtr, rPtr + 1);
                        boolean equalsTest = substrTest.equals(words[j]);

                        if(s.substring(lPtr, rPtr + 1).equals(words[j])) {
                            wordsFoundIdcs.add(j);
                            lPtr += words[0].length();
                            rPtr += words[0].length();
                        }
                    }
                }



                if (wordsFoundIdcs.size() == words.length) {
                    startingIndices.add(i);
                }
            }
        }

        return startingIndices;
    }
}
