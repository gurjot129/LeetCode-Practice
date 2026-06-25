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
    public ListNode reverseKGroup(ListNode head, int k) {

        //creates and initializes variables
        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = dummy;
        ListNode curr = head;

        boolean isNullReached = false;
        boolean isDummyUpdated = false;

        while(!isNullReached) {

            ListNode currTemp = curr;
            int count = 0;

            while(count < k && !isNullReached) {

                if(currTemp.next != null) {
                    currTemp = currTemp.next;
                    ++count;
                } else {
                    isNullReached = true;
                }
            }

            ListNode prev = null;

            for(int i = 0; i < k && !isNullReached; ++i) {

                ListNode tempNext = curr.next;
                curr.next = prev;

                prev = curr;
                curr = tempNext;
            }

            if(!isNullReached) {

                //update pointers
                leftPrev.next.next = curr;
                leftPrev.next = prev;
            }

            if(!isDummyUpdated) {
                dummy.next = prev;
                isDummyUpdated = true;
            }
        }


        return dummy.next;
    }
}