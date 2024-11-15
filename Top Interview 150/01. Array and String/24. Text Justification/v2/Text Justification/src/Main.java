import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
//        int maxWidth = 16;

        //test case #2
//        String[] words = { "What","must","be","acknowledgment","shall","be" };
//        int maxWidth = 16;

        //test case #3
        String[] words = { "Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do" };
        int maxWidth = 20;

        List<String> result = s.fullJustify(words, maxWidth);

        System.out.println("Final Results:");
        System.out.println("Text Justified: ");
        for(String sentence : result)
            System.out.println(sentence);
    }
}