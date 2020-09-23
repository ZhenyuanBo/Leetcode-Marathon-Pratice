/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> st = new Stack<>();

        ImmutableListNode curr = head;
        
        st.push(curr);
        
        while(curr.getNext()!=null){
            st.push(curr.getNext());
            curr = curr.getNext();
        }
        
        while(!st.isEmpty()){
            ImmutableListNode node = st.pop();
            node.printValue();
        }
    }
}