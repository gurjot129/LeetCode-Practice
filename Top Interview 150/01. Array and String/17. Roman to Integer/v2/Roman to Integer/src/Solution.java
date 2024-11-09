import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {

        //creates and initializes variables
        int integer = 0;
        HashMap<String, Integer> romanIntegerMap = new HashMap<>();

        //adds the roman and integer values to the HashMap, using HashMap should improve the efficiency and conciseness of the program
        romanIntegerMap.put("I", 1);
        romanIntegerMap.put("V", 5);
        romanIntegerMap.put("X", 10);
        romanIntegerMap.put("L", 50);
        romanIntegerMap.put("C", 100);
        romanIntegerMap.put("D", 500);
        romanIntegerMap.put("M", 1000);
        romanIntegerMap.put("IV", 4);
        romanIntegerMap.put("IX", 9);
        romanIntegerMap.put("XL", 40);
        romanIntegerMap.put("XC", 90);
        romanIntegerMap.put("CD", 400);
        romanIntegerMap.put("CM", 900);

        //iterates through the roman string characters and converts the roman values to int values at specific indices
        for(int i = 0; i < s.length(); ++i) {

            if(i < s.length() - 1 && romanIntegerMap.containsKey(s.substring(i, i + 2))) {
                integer += romanIntegerMap.get(s.substring(i, i + 2));
                ++i;
            } else {
                integer += romanIntegerMap.get(s.substring(i, i + 1));
            }
        }

        return integer;
    }
}
