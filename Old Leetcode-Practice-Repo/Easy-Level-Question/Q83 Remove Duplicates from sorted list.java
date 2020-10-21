/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        Set<Integer> set = new HashSet<Integer>();
        ListNode nextNode = head.next;
        ListNode prevNode = head;
        
        set.add(prevNode.val);

        while(nextNode!=null){
            if(!set.contains(nextNode.val)){
                set.add(nextNode.val);
                nextNode = nextNode.next;
                prevNode = prevNode.next;
            }else{
                prevNode.next = nextNode.next;
                nextNode = prevNode.next;
            }
        }
        
        return head;
    }
}