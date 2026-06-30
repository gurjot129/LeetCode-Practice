import java.util.ArrayDeque;
import java.util.Deque;

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

        //creates and initializes variables
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        Deque<ListNode> nodeOrder = new ArrayDeque<ListNode>();
        int size = 0;
        int rotateMod = 0;

        //find the size of the ll
        while(curr != null) {
            ++size;
            nodeOrder.addLast(curr);
            curr = curr.next;
        }

        //efficient way to rotate ll
        if(size != 0)
            rotateMod = k % size;

        //rotate ll to the right
        while(rotateMod > 0) {

            ListNode lastNode = nodeOrder.removeLast();
            ListNode next = dummy.next;

            dummy.next = lastNode;
            lastNode.next = next;

            nodeOrder.peekLast().next = null;

            nodeOrder.addFirst(lastNode);

            --rotateMod;
        }

        return dummy.next;
    }
}