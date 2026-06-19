/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {

        //creates and initializes variables
        Node headCurr = head;
        HashMap<Node, Node> originalToCopy = new HashMap<>(); //creates a reference between the original and new nodes
        originalToCopy.put(null, null);

        //creates new nodes, and stores the references to the original nodes via hashmaps
        while(headCurr != null) {
            originalToCopy.put(headCurr, new Node(headCurr.val));
            headCurr = headCurr.next;
        }

        headCurr = head;

        //populates the next and the random variables with the help of hashmaps
        while(headCurr != null) {
            Node copy = originalToCopy.get(headCurr);
            copy.next = originalToCopy.get(headCurr.next);
            copy.random = originalToCopy.get(headCurr.random);
            headCurr = headCurr.next;
        }


        return originalToCopy.get(head);
    }
}