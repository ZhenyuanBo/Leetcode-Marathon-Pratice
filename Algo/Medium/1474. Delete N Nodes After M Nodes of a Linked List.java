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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode prevNode = null;
        ListNode currNode = head;
        
        int currM = 0;
        int currN = 0;
        
        while(currNode!=null){
            if(currM!=m){
                prevNode = currNode;
                currNode = currNode.next;
                ++currM;
            }else{
                if(currN!=n){
                    prevNode.next = currNode.next;
                    currNode = prevNode.next;
                    ++currN;
                }else{
                    currN=0;
                    currM=0;
                }
            }
        }
        
        return head;
    }
}