import java.util.ArrayList;
import java.util.List;

public class Solution {

    //creates and initializes object variables
    private List<String> textJustification;
    private int currIdx;
    private int startIdx;
    private int widthCount;

    public Solution() {
        textJustification = new ArrayList<>();
        currIdx = 0;
        startIdx = 0;
        widthCount = 0;
    }

    public List<String> fullJustify(String[] words, int maxWidth) {

        while(currIdx < words.length) {

            //calculates and justifies all words before the last word
            if(currIdx < words.length - 1) {

                //calculates and evaluates if a line is ready to created and justified
                if(widthCount + words[currIdx].length() <= maxWidth - (currIdx - startIdx) )
                    widthCount += words[currIdx++].length();

                //creates line and adds it to the result
                if(widthCount + words[currIdx].length() > maxWidth - (currIdx - startIdx) ) {
                    justifySentence(words, maxWidth, false);
                }

            }
            //calculates and justifies all words in the sentence when at the last word
            else {

                //if the last word can fit in the current sentence, appends it and left justifies the sentence
                if(widthCount + words[currIdx].length() <= maxWidth - (currIdx - startIdx) ) {
                    widthCount += words[currIdx++].length();
                    justifySentence(words, maxWidth, true);
                }
                //if the last word doesn't fit with the current sentence, full justify the current sentence, and create a new left justified sentence for the last word
                else {
                    justifySentence(words, maxWidth, false);
                    widthCount += words[currIdx++].length();
                    justifySentence(words, maxWidth, true);
                }
            }

        }

        return textJustification;
    }

    //this function justifies a sentence, and appends it to the result
    private void justifySentence(String[] words, int maxWidth, boolean isLastWord) {

        //creates and initializes variables that will help with the text justification process
        StringBuilder sentence = new StringBuilder();
        int spaceCount = maxWidth - widthCount;
        int minSpaceBetweenWords = 0;
        int additionalSpaceBetweenWords = 0;

        //if there is only one word in a sentence, it will be left justified, otherwise more than one word will be full justified
        if((currIdx - startIdx) == 1) {
            textJustification.add( sentence.append(words[startIdx]).append(" ".repeat(spaceCount)).toString() );

        } else {
            //calculates the space between each word, including the additional space that will be added from left to right
            if(!isLastWord) {
                minSpaceBetweenWords = spaceCount / ((currIdx - startIdx) - 1);
                additionalSpaceBetweenWords = spaceCount % ((currIdx - startIdx) - 1);
            }

            //appends the words to the sentence with the appropriate spacing (including the additional space)
            for (int i = startIdx; i < currIdx; ++i) {
                if (additionalSpaceBetweenWords > 0) {
                    sentence.append(words[i]).append(" ".repeat(minSpaceBetweenWords + 1));
                    --additionalSpaceBetweenWords;
                } else {
                    if(i < currIdx - 1)
                        sentence.append(words[i]).append(isLastWord ? " " : " ".repeat(minSpaceBetweenWords));
                    else
                        sentence.append(words[i]);
                }
            }

            if(isLastWord) {
                //calculates the space that needs to be applied for left justification
                spaceCount = maxWidth - sentence.length();

                if(spaceCount > 0)
                    sentence.append(" ".repeat(spaceCount));
            }

            textJustification.add(sentence.toString());
        }

        //since sentence is justified, it is cleared so we can start constructing the next sentence
        clearSentence();
    }

    //this function clears the sentence
    public void clearSentence() {
        startIdx = currIdx;
        widthCount = 0;
    }
}