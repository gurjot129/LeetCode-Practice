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


public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        Integer[][] values1 = {
                {7, null},
                {13, 0},
                {11, 4},
                {10, 2},
                {1, 0}
        };
        Node head1 = new Node(values1[0][0]);
        Node curr1 = head1;

        for(int i = 1; i < values1.length; ++i) {
            curr1.next = new Node(values1[i][0]);
            curr1 = curr1.next;
        }

        Node result = solution.copyRandomList(head1);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");

        Node resCurr = result;

        while(resCurr != null) {
            System.out.print(resCurr.val + " ");
            resCurr = resCurr.next;
        }
    }
}