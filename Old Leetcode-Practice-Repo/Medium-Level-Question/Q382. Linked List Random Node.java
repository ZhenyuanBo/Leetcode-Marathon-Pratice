/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    /*
    using random.nextInt() to return a pseudorandom, uniformly distributed int value
    */
    ListNode h = null;
    Random random=null;
    public Solution(ListNode head) {
        h=head;
        random = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode c = h;
        int currentVal = c.val;
        int i=1;
        while(c.next!=null){
            c = c.next;
            if(random.nextInt(i+1)==i) currentVal = c.val;
            i++;
        }
        return currentVal;
    }
}