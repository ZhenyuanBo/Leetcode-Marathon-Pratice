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
    public void reorderList(ListNode head) {
        
        if(head == null) return;
        
        //find the middle node
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prevNode = null, curr = slow, next = slow.next;
        
        while(curr!=null){
            curr.next = prevNode;
            prevNode = curr;
            if(next!=null){
                curr = next;
                next = curr.next;
            }else{
                break;
            }
        }
        
        ListNode first = head, second = curr;
        
        while(second.next!=null){
            ListNode fNext = first.next;
            first.next = second;
            first = fNext;
            
            ListNode sNext = second.next;
            second.next = first;
            second = sNext;
        } 
        
    }
}