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
    public int[] nextLargerNodes(ListNode head) {
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        Stack<Integer> s = new Stack();
        
        ListNode curr = head;
        int numNodes=0;
        
        while(curr!=null){
            while(!s.isEmpty() && curr.val>s.peek()){
                if(map.containsKey(s.peek())){
                    map.get(s.peek()).add(curr.val);
                }else{
                    LinkedList<Integer> q = new LinkedList<>();
                    q.add(curr.val);
                    map.put(s.peek(), q);
                }
                s.pop();
            }
            s.push(curr.val);
            curr = curr.next;
            numNodes++;
        }
        
        while(!s.isEmpty()){
            int val = s.pop();
            if(map.containsKey(val)){
                map.get(val).add(0);
            }else{
                LinkedList<Integer> q = new LinkedList<>();
                q.add(0);
                map.put(val, q);
            }
        }
        
        curr = head;
        
        int[] ans = new int[numNodes];
        
        int i=0;
        while(curr!=null){
            int nextLargerVal = map.get(curr.val).poll();
            ans[i] = nextLargerVal;
            curr = curr.next;
            i++;
        }
        
        return ans;
    }
}