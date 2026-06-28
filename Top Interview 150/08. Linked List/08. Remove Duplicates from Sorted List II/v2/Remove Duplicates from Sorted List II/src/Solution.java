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
        if (head == null || head.next == null) return head;

        //creates and initializes variables
        ListNode dummy = new ListNode(-101, head);
        ListNode prev = dummy;
        ListNode curr = head;

        //iterates through the ll
        while (curr != null && curr.next != null) {

            //checks and identifies for duplicates
            //otherwise move to next node
            if (curr.val == curr.next.val) {

                //skips the nodes with the same value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                //changes prev node reference to remove duplicates from ll
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}