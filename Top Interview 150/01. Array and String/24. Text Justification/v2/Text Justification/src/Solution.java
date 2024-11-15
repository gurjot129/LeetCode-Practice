import java.util.ArrayList;
import java.util.List;

public class Solution {

    //creates and initializes object variables
    private List<String> textJustification;
    private List<String> wordsPerSentence;
    private int widthCount;

    public Solution() {
        textJustification = new ArrayList<>();
        wordsPerSentence = new ArrayList<>();
        widthCount = 0;
    }

    public List<String> fullJustify(String[] words, int maxWidth) {

        //creates and initializes variables
        int i = 0;

        while(i < words.length) {

            //calculates and justifies all words before the last word
            if(i < words.length - 1) {

                //calculates and evaluates if a line is ready to created and justified
                if(widthCount + words[i].length() <= maxWidth - wordsPerSentence.size() )
                    addWordToSentence(words, i++);

                //creates line and adds it to the result
                if(widthCount + words[i].length() > maxWidth - wordsPerSentence.size() ) {
                    justifySentence(maxWidth, false);
                }

            }
            //calculates and justifies all words in the sentence when at the last word
            else {

                //if the last word can fit in the current sentence, appends it and left justifies the sentence
                if(widthCount + words[i].length() <= maxWidth - wordsPerSentence.size()) {
                    addWordToSentence(words, i++);
                    justifySentence(maxWidth, true);
                }
                //if the last word doesn't fit with the current sentence, full justify the current sentence, and create a new left justified sentence for the last word
                else {
                    justifySentence(maxWidth, false);
                    addWordToSentence(words, i++);
                    justifySentence(maxWidth, true);
                }
            }

        }

        return textJustification;
    }

    //this function adds words that will become part of a sentence that will be justified
    private void addWordToSentence(String[] words, int idx) {
        widthCount += words[idx].length();
        wordsPerSentence.add(words[idx]);
    }

    //this function justifies a sentence, and appends it to the result
    private void justifySentence(int maxWidth, boolean isLastWord) {

        //creates and initializes variables that will help with the text justification process
        StringBuilder sentence = new StringBuilder();
        int spaceCount = maxWidth - widthCount;

        //if there is only one word in a sentence, it will be left justified, otherwise more than one word will be full justified
        if(wordsPerSentence.size() == 1) {
            textJustification.add( sentence.append(wordsPerSentence.get(0)).append(" ".repeat(spaceCount)).toString() );

        }
        //if the program hasn't reached the last word, full justifies the sentence
        else if(!isLastWord) {
            //calculates the space between each word, including the additional space that will be added from left to right
            int minSpaceBetweenWords = spaceCount / (wordsPerSentence.size() - 1);
            int additionalSpaceBetweenWords = spaceCount % (wordsPerSentence.size() - 1);

            //appends the words to the sentence with the appropriate spacing (including the additional space)
            for (int i = 0; i < wordsPerSentence.size(); ++i) {
                if (additionalSpaceBetweenWords > 0) {
                    sentence.append(wordsPerSentence.get(i)).append(" ".repeat(minSpaceBetweenWords + 1));
                    --additionalSpaceBetweenWords;
                } else {
                    if(i < wordsPerSentence.size() - 1)
                        sentence.append(wordsPerSentence.get(i)).append(" ".repeat(minSpaceBetweenWords));
                    else
                        sentence.append(wordsPerSentence.get(i));
                }
            }

            textJustification.add(sentence.toString());

        }
        //if the program reaches last word, left justifies the sentence
        else {

            //appends the words to the sentence with normal spacing
            for(int i = 0; i < wordsPerSentence.size(); ++i) {

                if(i < wordsPerSentence.size() - 1)
                    sentence.append(wordsPerSentence.get(i)).append(" ");
                else
                    sentence.append(wordsPerSentence.get(i));
            }

            //calculates the space that needs to be applied for left justification
            spaceCount = maxWidth - sentence.length();

            if(spaceCount > 0)
                sentence.append(" ".repeat(spaceCount));

            textJustification.add(sentence.toString());
        }

        //since sentence is justified, it is cleared so we can start constructing the next sentence
        clearSentence();

    }

    //this function clears the sentence
    public void clearSentence() {
        wordsPerSentence.clear();
        widthCount = 0;
    }
}
