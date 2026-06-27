import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        //handles edge cases
        if(head == null) {
            return head;
        } else if(head.next != null && head.next.next == null && head.val == head.next.val) {
            return null;
        }

        //creates and initializes variables
        ListNode dummy = new ListNode(-101, head);
        ListNode leftPtrPrev = dummy;
        ListNode leftPtr = head;
        ListNode rightPtr = head.next;

        //iterate through the ll until null is reached
        while(leftPtr != null && leftPtr.next != null) {

            //if duplicate values are found, remove duplicates
            //otherwise shift to next nodes
            if(leftPtr.val == rightPtr.val) {

                //check if there are other duplicate nodes ahead
                while(rightPtr.next != null && leftPtr.val == rightPtr.next.val) {
                    rightPtr = rightPtr.next;
                }

                //change node reference to remove duplicates
                leftPtrPrev.next = rightPtr.next;
                leftPtr = leftPtrPrev.next;

                if(leftPtr != null) {
                    rightPtr = leftPtr.next;
                }

            } else {
                leftPtrPrev = leftPtr;
                leftPtr = leftPtr.next;
                rightPtr = leftPtr.next;
            }
        }

        return dummy.next;
    }
}