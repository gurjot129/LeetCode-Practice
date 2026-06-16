
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] values1 = {2,4,3};
        ListNode head1 = new ListNode(values1[0]);
        ListNode curr1 = head1;

        for(int i = 1; i < values1.length; ++i) {
            curr1.next = new ListNode(values1[i]);
            curr1 = curr1.next;
        }


        int[] values2 = {5,6,4};
        ListNode head2 = new ListNode(values2[0]);
        ListNode curr2 = head2;

        for(int i = 1; i < values2.length; ++i) {
            curr2.next = new ListNode(values2[i]);
            curr2 = curr2.next;
        }


        ListNode result = solution.addTwoNumbers(head1, head2);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");

        String resString = "";
        String resStringRev = "";
        ListNode resCurr = result;

        while(resCurr != null) {
            resString += "" + resCurr.val;
            resCurr = resCurr.next;
        }

        for(int i = resString.length() - 1; i >= 0; --i) {
            resStringRev += resString.charAt(i);
        }

        System.out.println(resStringRev);
    }
}