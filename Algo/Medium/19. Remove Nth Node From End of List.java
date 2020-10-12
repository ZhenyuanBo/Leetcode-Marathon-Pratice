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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        int totalNodes=0;
        
        while(currNode!=null){
            totalNodes++;
            currNode = currNode.next;
        }
        
        int num = totalNodes - n + 1;
        
        ListNode prevNode = null;
        currNode = head;
        
        int currNum=0;
        
        while(currNum!=num-1){
            ++currNum;
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        if(prevNode!=null) prevNode.next = currNode.next;
        else{
            currNode = currNode.next;
            return currNode;
        }
        
        return head;
    }
}