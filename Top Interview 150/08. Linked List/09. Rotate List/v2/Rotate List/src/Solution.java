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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return head;

        //creates and initializes variables
        ListNode tail = head;
        int size = 1;

        //find the size of the ll
        while(tail.next != null) {
            ++size;
            tail = tail.next;
        }

        //calculates the number of rotations using mod,
        //which could significantly reduce the number of rotations
        k = k % size;

        if(k == 0) return head;

        ListNode curr = head;

        //find where to detach the ll and move it to the front as the new head
        for(int i = 0; i < size - k - 1; ++i)
            curr = curr.next;

        ListNode newHead = curr.next; //stores the start part of the split that you want to move to front
        curr.next = null; // this represent the end of the ll after the rotation
        tail.next = head; //the represents the end part of the split, it will be connected to the beginning part of the ll

        return newHead;
    }
}