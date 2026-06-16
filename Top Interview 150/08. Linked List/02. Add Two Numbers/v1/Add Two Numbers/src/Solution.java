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
        ListNode result = null;
        ListNode resultCurr = new ListNode(0);

        int prevFirstDigit = 0; //stores quotient
        boolean isHeadCreated = false; //ensures to store the head of the linkedlist

        //the total will be concluded once both ll's reach null
        while(l1 != null || l2 != null) {

            //calculates quotient, which will be added to the next node
            int firstDigit = ( (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) ) / 10;

            //calculates remainder, which wiil be added to the current node
            int secondDigit = ( (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) ) % 10;

            //adds to the quotient
            firstDigit += (secondDigit + prevFirstDigit) / 10;

            //adds the remainder to the current node
            resultCurr.val = (secondDigit + prevFirstDigit) % 10;

            //ensures to save head of result ll
            if(!isHeadCreated) {
                result = resultCurr;
                isHeadCreated = true;
            }

            //saves next nodes that need to be calculated
            l1 = l1 != null ? (l1.next != null ? l1.next : null) : null;
            l2 = l2 != null ? (l2.next != null ? l2.next : null) : null;

            //prepares quotient for next values
            prevFirstDigit = firstDigit;

            //if both nodes are not null, prepare next node for ll result
            //else create the last node with quotient value
            if(l1 != null || l2 != null) {
                resultCurr.next = new ListNode(0);
                resultCurr = resultCurr.next;
            } else {
                resultCurr.next = prevFirstDigit != 0 ? new ListNode(prevFirstDigit) : null;
            }

        }
        
        return result == null ? new ListNode(0) : result;
    }
}