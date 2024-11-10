public class Solution {

    public String intToRoman(int num) {

        //creates and initializes variables
        String roman = "";

        //starts by evaluating larger numbers, and then moves onto smaller and smaller numbers
        while(num > 0) {

            if(num / 1000 >= 1) {
                roman += "M";
                num -= 1000;

            } else if(num / 900 >= 1) {
                roman += "CM";
                num -= 900;

            } else if(num / 500 >= 1) {
                roman += "D";
                num -= 500;

            } else if(num / 400 >= 1) {
                roman += "CD";
                num -= 400;

            } else if(num / 100 >= 1) {
                roman += "C";
                num -= 100;

            } else if(num / 90 >= 1) {
                roman += "XC";
                num -= 90;

            } else if(num / 50 >= 1) {
                roman += "L";
                num -= 50;

            } else if(num / 40 >= 1) {
                roman += "XL";
                num -= 40;

            } else if(num / 10 >= 1) {
                roman += "X";
                num -= 10;

            } else if(num / 9 >= 1) {
                roman += "IX";
                num -= 9;

            } else if(num / 5 >= 1) {
                roman += "V";
                num -= 5;

            } else if(num / 4 >= 1) {
                roman += "IV";
                num -= 4;

            } else if(num >= 1) {
                roman += "I";
                num -= 1;

            }
        }

        return roman;
    }
}
