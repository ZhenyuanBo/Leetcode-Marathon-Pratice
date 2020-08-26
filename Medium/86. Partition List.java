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
    public ListNode partition(ListNode head, int x) {
        List<Integer> smallValues = new ArrayList<Integer>();
        List<Integer> bigValues = new ArrayList<Integer>();
        
        ListNode currNode = head;
        
        while(currNode!=null){
            if(currNode.val<x){
                smallValues.add(currNode.val);
            }else{
                bigValues.add(currNode.val);
            }
            currNode = currNode.next;
        }
        
        currNode = head;
        
        for(Integer svalue: smallValues){
            currNode.val = svalue;
            currNode = currNode.next;
        }
        
        for(Integer bvalue: bigValues){
            currNode.val = bvalue;
            currNode = currNode.next;
        }
        
        return head;
    }
}