public class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        //creates and initializes variables
        StringBuilder zigzag = new StringBuilder();
        int increment = 2 * (numRows - 1);

        //this loop calculates which characters go into specific rows
        for(int r = 0; r < numRows; ++r) {

            for(int i = r; i < s.length(); i += increment) {
                zigzag.append(s.charAt(i));

                if(r > 0 && r < (numRows - 1) && (i + increment - 2 * r) < s.length())
                    zigzag.append(s.charAt(i + increment - 2 * r));
            }
        }

        return zigzag.toString();
    }

}
