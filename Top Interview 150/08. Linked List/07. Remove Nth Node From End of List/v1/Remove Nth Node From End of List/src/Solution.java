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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //handles null and single node edge cases
        if(head == null) {
            return head;
        } else if(head.next == null) {
            return head.next;
        }

        //creates and initializes variables
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        int size = 0;
        int removeNodePos = 0;

        //finds total size
        while(curr != null) {
            ++size;
            curr = curr.next;
        }

        //calculates the node position that needs to be removed
        removeNodePos = size - n + 1;

        //stores relevant nodes that either need to be removed and other that need to be stitched together
        curr = head;
        ListNode prev = dummy;
        ListNode next = curr.next;

        //iterates to the removed node position
        for(int i = 1; i < removeNodePos; ++i) {
            prev = curr;
            curr = curr.next;
            next = curr.next;
        }

        //removes the relevant node and connects the previous node to the node ahead of the removed node
        prev.next = next;
        curr.next = null;

        return dummy.next;
    }
}