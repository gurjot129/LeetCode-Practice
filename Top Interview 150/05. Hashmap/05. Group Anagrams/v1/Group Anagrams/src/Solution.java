import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        //creates and initializes variables
        List<List<String>> ga = new ArrayList<>();
        HashMap<String, Integer> gaIdx = new HashMap<>();
        int idx = 0;

        //iterates through strs array and evaluates each value
        for(String s : strs) {

            //sorts each string, in order for it to represent a key, that will hold the index value of the array list
            String sortedS = s;
            char[] sCharArr = sortedS.toCharArray();
            Arrays.sort(sCharArr);
            sortedS = new String(sCharArr);

            //if anagram not found, then add a new arraylist to the list
            boolean isAnagramFound = false;

            //if the sorted array (which represents a key) exists in the hashmap, it exists in the arraylist, therefore, add the string to the respective arraylist (with the appropriate arraylist index)
            if(gaIdx.containsKey(sortedS)) {
                ga.get(gaIdx.get(sortedS)).add(s);
                isAnagramFound = true;
            }

            //if arraylist is empty OR anagram not found, then add a new arraylist to the list
            if(ga.isEmpty() || !isAnagramFound) {
                gaIdx.put(sortedS, idx++);
                ga.add(new ArrayList<String>(List.of(s)));
            }

        }

        return ga;
    }
}
