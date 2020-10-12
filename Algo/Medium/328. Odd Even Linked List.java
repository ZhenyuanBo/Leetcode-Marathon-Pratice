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
    public ListNode oddEvenList(ListNode head) {
        ListNode currNode = head;
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        
        int index=1;
        
        while(currNode!=null){
            if(index%2==0){
                evenList.add(currNode.val);
            }else{
                oddList.add(currNode.val);
            }
            currNode = currNode.next;
            ++index;
        }
        
        currNode = head;
        
        for(Integer value: oddList){
            currNode.val = value;
            currNode = currNode.next;
        }
        
        for(Integer value: evenList){
            currNode.val = value;
            currNode = currNode.next;
        }
        
        return head;
        
        
    }
}