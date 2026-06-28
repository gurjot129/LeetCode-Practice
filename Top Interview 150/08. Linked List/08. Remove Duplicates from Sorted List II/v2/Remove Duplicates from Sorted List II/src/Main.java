// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[] values1 = {1,2,3,3,4,4,5};
//        ListNode head1 = new ListNode(values1[0]);
//        ListNode curr1 = head1;
//
//        for (int i = 1; i < values1.length; ++i) {
//            curr1.next = new ListNode(values1[i]);
//            curr1 = curr1.next;
//        }

        //test case #6
//        int[] values1 = {1,1};
//        ListNode head1 = new ListNode(values1[0]);
//        ListNode curr1 = head1;
//
//        for (int i = 1; i < values1.length; ++i) {
//            curr1.next = new ListNode(values1[i]);
//            curr1 = curr1.next;
//        }

        //test case #7
        int[] values1 = {1,2,2};
        ListNode head1 = new ListNode(values1[0]);
        ListNode curr1 = head1;

        for (int i = 1; i < values1.length; ++i) {
            curr1.next = new ListNode(values1[i]);
            curr1 = curr1.next;
        }

        ListNode result = solution.deleteDuplicates(head1);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");

        ListNode resCurr = result;

        while (resCurr != null) {
            System.out.print(resCurr.val + " ");
            resCurr = resCurr.next;
        }
    }
}