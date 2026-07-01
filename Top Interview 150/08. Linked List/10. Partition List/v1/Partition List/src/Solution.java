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
    public ListNode partition(ListNode head, int x) {

        //creates and initializes variables
        ListNode left = new ListNode(0, null);
        ListNode right = new ListNode(0, null);

        ListNode lTail = left;
        ListNode rTail = right;

        //iterates through the ll
        while(head != null) {

            //if node value is higher than x, append to left node
            //else append to right node
            if(head.val < x) {
                lTail.next = head;
                lTail = lTail.next;
            } else {
                rTail.next = head;
                rTail = rTail.next;
            }

            head = head.next;
        }

        //appends the 2 lls together
        lTail.next = right.next;
        rTail.next = null;

        return left.next;
    }
}