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
    public ListNode rotateRight(ListNode head, int k) {
        
        List<Integer> numList = new ArrayList<>();
        ListNode currNode = head;

        while(currNode!=null){
            numList.add(currNode.val);
            currNode = currNode.next;
        }

        int[] rotatedNumList = new int[numList.size()];
        
        for(int i=0; i<numList.size(); i++){
            int newIndex = (i+k) % numList.size();
            rotatedNumList[newIndex] = numList.get(i);
        }
        
        currNode = head;
        
        int j=0;
        
        while(currNode!=null){
            currNode.val = rotatedNumList[j];
            currNode = currNode.next;
            j++;
        }
        
        return head;
    }
}