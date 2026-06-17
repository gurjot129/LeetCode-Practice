/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //creates and initializes variables
        ListNode result = new ListNode();
        ListNode resCurr = result;

        //if either node hasn't reached null, continue to assess, merge and build result ll
        while (list1 != null || list2 != null) {

            if (list1 == null) {
                resCurr.next = new ListNode(list2.val);
                list2 = list2.next;

            } else if (list2 == null) {
                resCurr.next = new ListNode(list1.val);
                list1 = list1.next;

            } else if (list1.val <= list2.val) {
                resCurr.next = new ListNode(list1.val);
                list1 = list1.next;

            } else {
                resCurr.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            resCurr = resCurr.next;
        }

        return result.next != null ? result.next : null;
    }
}