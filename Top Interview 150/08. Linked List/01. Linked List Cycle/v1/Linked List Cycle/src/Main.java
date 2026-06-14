
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
        int[] values = {3,2,0,-4};
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;

        for(int i = 1; i < values.length; ++i) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }

        curr.next = head.next;


        boolean result = solution.hasCycle(head);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: " + result);
    }
}