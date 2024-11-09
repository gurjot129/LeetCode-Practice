import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {

        //creates and initializes variables
        int integer = 0;

        //iterates through the roman string characters and converts the roman values to int values at specific indices
        for(int i = 0; i < s.length(); ++i) {

            if(s.startsWith("IV", i)) {
                integer += 4;
                ++i;

            } else if(s.startsWith("IX", i)) {
                integer += 9;
                ++i;

            } else if(s.startsWith("XL", i)) {
                integer += 40;
                ++i;

            } else if(s.startsWith("XC", i)) {
                integer += 90;
                ++i;

            } else if(s.startsWith("CD", i)) {
                integer += 400;
                ++i;

            } else if(s.startsWith("CM", i)) {
                integer += 900;
                ++i;
            }
            else if(s.startsWith("I", i)) integer += 1;
            else if(s.startsWith("V", i)) integer += 5;
            else if(s.startsWith("X", i)) integer += 10;
            else if(s.startsWith("L", i)) integer += 50;
            else if(s.startsWith("C", i)) integer += 100;
            else if(s.startsWith("D", i)) integer += 500;
            else if(s.startsWith("M", i)) integer += 1000;
        }

        return integer;
    }
}
