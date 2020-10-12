class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        
        int j=0, maxLen=0;
        
        for(int i=0; i<nums.length; i++){
            minQ.add(nums[i]);
            maxQ.add(nums[i]);
            
            //this condition is when window needs to be contracted
            while(Math.abs(minQ.peek()-maxQ.peek())>limit){
                minQ.remove(nums[j]);
                maxQ.remove(nums[j]);
                j++;
            }
            
            maxLen = Math.max(maxLen, i-j+1);
        }
        
        return maxLen;
    }
}