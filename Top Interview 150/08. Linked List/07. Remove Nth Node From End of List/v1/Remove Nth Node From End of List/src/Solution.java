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

        if(head == null) {
            return head;
        } else if(head.next == null) {
            return head.next;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        int size = 0;
        int removeNodePos = 0;

        //finds total size
        while(curr != null) {
            ++size;
            curr = curr.next;
        }

        removeNodePos = size - n + 1;

        System.out.println("Size: " + size);
        System.out.println("RemoveNodePos: " + removeNodePos);

        curr = head;
        ListNode prev = null;
        ListNode next = curr.next;

        for(int i = 1; i < removeNodePos; ++i) {
            prev = curr;
            curr = curr.next;
            next = curr.next;
        }

        prev.next = next;
        curr.next = null;

        return dummy.next;
    }
}