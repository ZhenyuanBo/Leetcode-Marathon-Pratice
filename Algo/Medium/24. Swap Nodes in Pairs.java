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
    public ListNode swapPairs(ListNode head) {
        ListNode prevNode = head;
        ListNode nextNode = null;
        if(head!=null) nextNode = head.next;
        
        while(prevNode!=null && nextNode!=null){
            int temp = nextNode.val;
            nextNode.val = prevNode.val;
            prevNode.val = temp;
            if(prevNode.next!=null){
                prevNode = prevNode.next.next;
            }
            if(nextNode.next!=null){
                nextNode = nextNode.next.next;
            }
        }
        
        return head;
    }
}