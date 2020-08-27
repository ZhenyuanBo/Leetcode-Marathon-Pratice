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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<Integer> numList = new ArrayList<>();
        
        int index=1;
        
        ListNode currNode = head;
        
        while(currNode!=null){
            if(index<m || index>n){
                currNode = currNode.next;
            }else if(index>=m && index<=n){
                numList.add(currNode.val);
                currNode = currNode.next;
            }
            index++;
        }

        currNode = head;
        index = 1;
        int j = numList.size()-1;
        
        while(currNode!=null){
            if(index>=m && index<=n){
                currNode.val = numList.get(j);
                --j;
            }
            currNode = currNode.next;
            index++;
        }
        
        return head;
    }
}