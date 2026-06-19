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
        ArrayList<ListNode> leftToRightNodes = new ArrayList<>(); //stores the relevant nodes that need to be in reverse order
        ListNode headCurr = head;
        ListNode startNode = null; //the node before the left node, will point to the beginning of the reverse nodes
        ListNode endNode = null; //the node before the right node, reverse nodes will point to this node
        boolean isLeftNodeFound = false;
        boolean isRightNodeFound = false;

        //iterates, evaluates and stores the nodes the need to be reversed
        while(headCurr != null && !isRightNodeFound) {

            //determines starting node once left node is found
            if(headCurr.val == left && !isLeftNodeFound) {
                isLeftNodeFound = true;
            } else if (!isLeftNodeFound) {
                startNode = headCurr;
            }

            //once left node is found, the relevant nodes from left to right will be stored
            //Also determines the end node once the right node is found
            if(isLeftNodeFound && headCurr.val != right) {
                leftToRightNodes.add(headCurr);
            } else if(isLeftNodeFound) {
                leftToRightNodes.add(headCurr);
                isRightNodeFound = true;
                endNode = headCurr.next;
            }

            headCurr = headCurr.next;
        }

        //joins the start node and reverse nodes
        for(int i = leftToRightNodes.size() - 1; i >= 0; --i) {
            startNode.next = leftToRightNodes.get(i);
            startNode = startNode.next;
        }

        //joins the end node
        startNode.next = endNode;

        return head;
    }
}