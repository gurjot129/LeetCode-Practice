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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //creates and initializes variables
        ListNode result = new ListNode(0);
        ListNode resCurr = result;
        int quotient = 0;

        while(l1 != null || l2 != null || quotient != 0) {

            //calculates current nodes value total
            int currNodesTotal = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + quotient;

            //calculates quotient for carrying over and stores the remainder in the current result node
            quotient = currNodesTotal / 10;
            resCurr.next = new ListNode(currNodesTotal % 10);

            //assign the next nodes to assess and store values
            resCurr = resCurr.next;
            l1 = l1 != null ? (l1.next != null ? l1.next : null) : null;
            l2 = l2 != null ? (l2.next != null ? l2.next : null) : null;
        }

        return result.next != null ? result.next : result;
    }
}