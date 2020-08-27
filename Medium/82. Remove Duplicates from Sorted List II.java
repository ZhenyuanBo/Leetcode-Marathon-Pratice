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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode currNode = head;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        List<Integer> numList = new ArrayList<>();
        
        
        while(currNode!=null){
            int freq = map.getOrDefault(currNode.val, 0)+1;
            map.put(currNode.val, freq);
            currNode = currNode.next;
        }

        for(Integer key: map.keySet()){
            if(map.get(key)==1) numList.add(key);
        }
        
        if(numList.size()==0) return null;
        
        currNode = head;
        
        for(int i=0; i<numList.size(); i++){
            currNode.val = numList.get(i);
            if(i==numList.size()-1){
                currNode.next = null;
            }else currNode = currNode.next;
        }
        
        
        return head;
    }
}