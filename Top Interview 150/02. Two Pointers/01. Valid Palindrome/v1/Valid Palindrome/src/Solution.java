public class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("After modifying string s: " + s);

        for(int i = 0; i < s.length() / 2; ++i)
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;

        return true;
    }
}
