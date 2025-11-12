import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {

        //creates and initializes variables
        Map<String, Integer> wordCount = new HashMap<>();
        List<Integer> indexes = new ArrayList<>();
        int sLen = s.length();
        int wordsLen = words.length;
        int wordLen = words[0].length();

        //count the number of words in the words array
        for (String word : words)
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        //this iteration goes through each element of s
        for (int i = 0; i < sLen - (wordsLen * wordLen) + 1; i++) {

            Map<String, Integer> seen = new HashMap<>();
            int j = 0;

            while (j < wordsLen) {
                //finds and extracts substring
                String word = s.substring(i + j * wordLen, i + (j + 1) * wordLen);

                //checks if this word exists in the word array
                if (wordCount.containsKey(word)) {

                    //increments counter for specific word
                    seen.put(word, seen.getOrDefault(word, 0) + 1);

                    //if the current count of the word exceeds the words given in the words array, it is incorrect, therefore break loop
                    if (seen.get(word) > wordCount.getOrDefault(word, 0))
                        break;

                } else
                    break; //since word doesn't exist, break loop

                j++;
            }

            //if all words have been found in the substring, add the beginning index of substring
            if (j == wordsLen)
                indexes.add(i);
        }
        return indexes;
    }
}