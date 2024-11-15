import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {

        //creates and initializes variables
        List<String> textJustification = new ArrayList<>();
        List<String> wordsPerSentence = new ArrayList<>();
        int widthCount = 0;
        int i = 0;

        while(i < words.length) {

            //calculates and evaluates if a line is ready to created and justified
            if(i < words.length - 1 && widthCount + words[i].length() <= maxWidth - wordsPerSentence.size() ) {
                widthCount += words[i].length();
                wordsPerSentence.add(words[i]);
                ++i;
            }

            //creates line and adds it to the result
            if(i < words.length - 1 && widthCount + words[i].length() > maxWidth - wordsPerSentence.size() ) {
                StringBuilder sentence = new StringBuilder();
                int spaceCount = maxWidth - widthCount;

                if(wordsPerSentence.size() == 1) {
                    textJustification.add( sentence.append(wordsPerSentence.get(0)).append(" ".repeat(spaceCount)).toString() );

                } else {
                    int minSpaceBetweenWords = spaceCount / (wordsPerSentence.size() - 1);
                    int additionalSpaceBetweenWords = spaceCount % (wordsPerSentence.size() - 1);

                    for(int j = 0; j < wordsPerSentence.size(); ++j) {
                        if(additionalSpaceBetweenWords > 0) {
                            sentence.append(wordsPerSentence.get(j)).append(" ".repeat(minSpaceBetweenWords + 1));
                            --additionalSpaceBetweenWords;
                        } else {
                            sentence.append(wordsPerSentence.get(j)).append(" ".repeat(minSpaceBetweenWords));
                        }
                    }

                    textJustification.add(sentence.toString().trim());
                }

                wordsPerSentence.clear();
                widthCount = 0;

            } else if(i == words.length - 1 && widthCount + words[i].length() <= maxWidth - wordsPerSentence.size()) {

                widthCount += words[i].length();
                wordsPerSentence.add(words[i]);
                ++i;

                StringBuilder sentence = new StringBuilder();
                int spaceCount = maxWidth - widthCount;

                if(wordsPerSentence.size() == 1) {
                    textJustification.add( sentence.append(wordsPerSentence.get(0)).append(" ".repeat(spaceCount)).toString() );

                } else {
                    for(int j = 0; j < wordsPerSentence.size(); ++j) {

                        if(j < wordsPerSentence.size() - 1)
                            sentence.append(wordsPerSentence.get(j)).append(" ");
                        else
                            sentence.append(wordsPerSentence.get(j));
                    }

                    spaceCount = maxWidth - sentence.length();

                    if(spaceCount > 0)
                        sentence.append(" ".repeat(spaceCount));

                    textJustification.add(sentence.toString());
                }

                wordsPerSentence.clear();
                widthCount = 0;

            } else if(i == words.length - 1 && widthCount + words[i].length() > maxWidth - wordsPerSentence.size()) {

                StringBuilder sentence = new StringBuilder();
                int spaceCount = maxWidth - widthCount;

                if(wordsPerSentence.size() == 1) {
                    textJustification.add( sentence.append(wordsPerSentence.get(0)).append(" ".repeat(spaceCount)).toString() );

                } else {
                    int minSpaceBetweenWords = spaceCount / (wordsPerSentence.size() - 1);
                    int additionalSpaceBetweenWords = spaceCount % (wordsPerSentence.size() - 1);

                    for(int j = 0; j < wordsPerSentence.size(); ++j) {
                        if(additionalSpaceBetweenWords > 0) {
                            sentence.append(wordsPerSentence.get(j)).append(" ".repeat(minSpaceBetweenWords + 1));
                            --additionalSpaceBetweenWords;
                        } else {
                            sentence.append(wordsPerSentence.get(j)).append(" ".repeat(minSpaceBetweenWords));
                        }
                    }

                    textJustification.add(sentence.toString().trim());
                }

                wordsPerSentence.clear();
                widthCount = 0;

                widthCount += words[i].length();
                wordsPerSentence.add(words[i]);
                ++i;

                sentence = new StringBuilder();
                spaceCount = maxWidth - widthCount;

                textJustification.add( sentence.append(wordsPerSentence.get(0)).append(" ".repeat(spaceCount)).toString() );
            }

        }

        return textJustification;
    }

}
