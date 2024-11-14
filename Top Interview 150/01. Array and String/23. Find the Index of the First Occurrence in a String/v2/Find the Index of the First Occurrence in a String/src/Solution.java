public class Solution {

    public int strStr(String haystack, String needle) {

        //loops checks each haystack elements, assumes it as a potential first occurrence
        for(int i = 0; i < haystack.length(); ++i) {

            //checks to see if the all elements of needle match in haystack
            for(int j = 0; j < needle.length(); ++j) {

                if ((i + j) >= haystack.length()) //if indices out of bounds, return -1
                    return -1;
                else if(needle.charAt(j) != haystack.charAt(i + j)) //if elements don't match, start at next element
                    break;
                else if (j == (needle.length() - 1)) //if all needle elements match, return the index that we started checking at
                    return i;
            }
        }

        return -1;
    }

}
