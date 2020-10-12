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
    public ListNode plusOne(ListNode head) {
        
        ListNode currNode = head;
        List<Integer> numList = new ArrayList<>();
        
        int totalNodes=0;
        
        while(currNode!=null){
            numList.add(currNode.val);
            currNode = currNode.next;
            ++totalNodes;
        }
        
        int carry=0, sumVal=0;
        
        for(int i=numList.size()-1; i>=0; i--){
            if(i==numList.size()-1){
                sumVal = (numList.get(i)+1)%10;
                carry = (numList.get(i) + 1)/10;
            }else{
                sumVal = (numList.get(i)+carry)%10;
                carry = (numList.get(i) + carry)/10;
            }
            
            numList.set(i, sumVal);
        }
        
        if(carry>0){
            numList.add(0, carry);
        }
        
        ListNode newHead=null;
        int i=0;
        
        if(totalNodes<numList.size()){
            newHead = new ListNode(numList.get(0));
            i++;
        }
        
        currNode = head;
        
        while(currNode!=null){
            currNode.val = numList.get(i);
            i++;
            currNode = currNode.next;
        }
        
        if(newHead != null){
            newHead.next = head;
            return newHead;
        }
        
        return head;
        
        
    }
}