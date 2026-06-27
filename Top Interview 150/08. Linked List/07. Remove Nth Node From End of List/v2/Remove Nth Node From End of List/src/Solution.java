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

        //creates and initializes variables
        ListNode dummy = new ListNode(0, head);
        ListNode leftPtr = dummy;
        ListNode rightPtr = head;

        //shifts the right pointer by n
        while(n > 0 && rightPtr != null) {
            rightPtr = rightPtr.next;
            --n;
        }

        //once the right pointer reaches the end of the ll,
        //the left pointer will be n distance away from the end of the ll
        while(rightPtr != null) {
            leftPtr = leftPtr.next;
            rightPtr = rightPtr.next;
        }

        //removes relevant node
        leftPtr.next = leftPtr.next.next;

        return dummy.next;
    }
}