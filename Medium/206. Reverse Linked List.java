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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
            
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = head.next;
        
        while(currNode!=null){
            currNode.next = prevNode;
            prevNode = currNode;
            if(nextNode!=null){
                currNode = nextNode;
                nextNode = currNode.next;
            }else{
                break;
            }
        }
        
        return currNode;
    }
}