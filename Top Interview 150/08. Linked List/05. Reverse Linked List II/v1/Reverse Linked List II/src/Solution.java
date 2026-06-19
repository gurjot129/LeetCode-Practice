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

        ArrayList<ListNode> leftToRightNodes = new ArrayList<>();
        ListNode headCurr = head;
        ListNode startNode = null;
        ListNode endNode = null;
        boolean isLeftNodeFound = false;
        boolean isRightNodeFound = false;

        while(headCurr != null && !isRightNodeFound) {

            if(headCurr.val == left && !isLeftNodeFound) {
                isLeftNodeFound = true;
            } else if (!isLeftNodeFound) {
                startNode = headCurr;
            }

            if(isLeftNodeFound && headCurr.val != right) {
                leftToRightNodes.add(headCurr);
            } else if(isLeftNodeFound) {
                leftToRightNodes.add(headCurr);
                isRightNodeFound = true;
                endNode = headCurr.next;
            }

            headCurr = headCurr.next;
        }

        for(int i = leftToRightNodes.size() - 1; i >= 0; --i) {
            startNode.next = leftToRightNodes.get(i);
            startNode= startNode.next;
        }

        startNode.next = endNode;

        return head;
    }
}