/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //copy the next node value over to the deleted one
        node.val = node.next.val;
        node.next = node.next.next;
    }
}