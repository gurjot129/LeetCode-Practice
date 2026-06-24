import java.util.ArrayList;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //creates and initializes variables
        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = dummy;
        ListNode curr = head;

        //reaches the left position node
        for(int i = 0; i < (left - 1); ++i) {
            leftPrev = curr;
            curr = curr.next;
        }

        //reverses the nodes from left to right positions
        ListNode prev = null;

        for(int i = 0; i < (right - left + 1); ++i) {

            ListNode tempNext = curr.next;
            curr.next = prev;

            prev = curr;
            curr = tempNext;
        }

        //update pointers
        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;
    }
}