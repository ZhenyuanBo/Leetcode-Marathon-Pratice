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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        
        ListNode curr = head;
        
        while(curr!=null){
            sb.append(curr.val);
            curr = curr.next;
        }
        
        int sum=0, numDigits = sb.length();
        
        for(char digit: sb.toString().toCharArray()){
            sum += Character.getNumericValue(digit) * Math.pow(2, numDigits-1);
            numDigits-=1;
        }
        
        return sum;
    }
}