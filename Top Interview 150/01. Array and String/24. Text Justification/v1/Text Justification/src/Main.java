import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
        int maxWidth = 16;

        List<String> result = s.fullJustify(words, maxWidth);

        System.out.println("Final Results:");
        System.out.println("Text Justified: ");
        for(String sentence : result)
            System.out.println(sentence);

    }
}