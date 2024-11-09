//import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {

        //creates and initializes variables
        int integer = 0;

//        HashMap<Character, Integer> romanIntegerMap = new HashMap<>();
//
//        //adds the roman and integer values to the HashMap, using HashMap should improve the efficiency and conciseness of the program
//        romanIntegerMap.put('I', 1);
//        romanIntegerMap.put('V', 5);
//        romanIntegerMap.put('X', 10);
//        romanIntegerMap.put('L', 50);
//        romanIntegerMap.put('C', 100);
//        romanIntegerMap.put('D', 500);
//        romanIntegerMap.put('M', 1000);

        //Map.of() is apparently more efficient than HashMap, as long as there 10 elements of less, and that they are immutable
        //However, I've noticed that it's makes a minuscule difference, but I could be wrong
        Map<Character, Integer> romanIntegerMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        //iterates through the roman string characters and converts the roman values to int values at specific indices
        for(int i = 0; i < s.length(); ++i) {
            if(i < s.length() - 1 && romanIntegerMap.get(s.charAt(i)) < romanIntegerMap.get(s.charAt(i + 1))) {
                integer -= romanIntegerMap.get(s.charAt(i));
            } else {
                integer += romanIntegerMap.get(s.charAt(i));
            }
        }

        return integer;
    }
}
