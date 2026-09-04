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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        // while returning from stack assigning it to head.next
        head.next = removeElements(head.next, val);

        // if current node == val then return next value
        if(head.val == val) return head.next;

        // return current node
        return head;}
}