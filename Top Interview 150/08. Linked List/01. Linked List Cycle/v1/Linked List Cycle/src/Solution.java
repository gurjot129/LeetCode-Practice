import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //creates and initializes variables
        ListNode curr = head;
        HashMap<Integer, String> nodeRefs = new HashMap<>();
        boolean isCycle = false;
        int currPos = 0;

        //iterates through the linked list until a repeated node is found, or null is reached
        while(curr != null && !isCycle) {
//            System.out.println(curr);
//            System.out.println(curr.val);
//            System.out.println("");

            //stores and checks in hashmap for any repeated node references
            if(!nodeRefs.containsValue(curr.toString())) {
                nodeRefs.put(currPos++, curr.toString());
                curr = curr.next;
            } else {
                isCycle = true;
            }
        }

        return isCycle;
    }
}