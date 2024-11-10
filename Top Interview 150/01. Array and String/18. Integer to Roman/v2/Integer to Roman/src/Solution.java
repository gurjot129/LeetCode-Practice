public class Solution {
    public String intToRoman(int num) {

        //creates and initializes variables
        //Using a 2D array is more efficient than a list, however, 2D array has the limitation of only using 1 object/primitive type, in this case string was chosen
        String[][] romanIntegerArray = {
                {"I", "1"}, {"IV", "4"}, {"V", "5"}, {"IX", "9"},
                {"X", "10"}, {"XL", "40"}, {"L", "50"}, {"XC", "90"},
                {"C", "100"}, {"CD", "400"}, {"D", "500"}, {"CM", "900"},
                {"M", "1000"}
        };

        //StringBuilder is more efficient than String, since StringBuilder is mutable and no new objects need to be allocated
        StringBuilder res = new StringBuilder();

        //iterate through the roman/int list, in order to evaluate the integer value, from biggest to smallest number
        for (int i = romanIntegerArray.length - 1; i >= 0; i--) {
            String sym = romanIntegerArray[i][0];
            int val = Integer.parseInt(romanIntegerArray[i][1]);

            if (num >= val) {

                //counts how many roman values are needed for a specific roman value
                int count = num / val;

                //appends the specific roman values certain amount of times
                for (int j = 0; j < count; j++)
                    res.append(sym);

                //update the integer value with the remainder, in order to focus on the next categories of roman values
                num %= val;
            }
        }

        return res.toString();
    }
}
