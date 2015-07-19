/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode current = head;
        while(current != null) {
            /**
             * Find the next, and then swap them.
             */
            ListNode temp = current.next;
            current.next = newHead;
            newHead = current;
            current = temp;
        }
        head = newHead;
        return head;
    }
}
