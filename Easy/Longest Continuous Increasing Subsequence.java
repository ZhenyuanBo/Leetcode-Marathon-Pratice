class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        if(nums.length==0) return 0;
        
        int maxLen = Integer.MIN_VALUE;
        int s=0;
        
        int prev = nums[0];
        
        int count=1;
        
        while(s<nums.length-1){
           for(int i=s+1; i<nums.length; i++){
               if(nums[i]>prev){
                  count++;
               }else{
                   maxLen = Math.max(maxLen, count);
                   count=1;
                   prev=nums[i];
                   break;
               }
               prev=nums[i];
           }
           s++;
        }
        
        return Math.max(count, maxLen);
    }
}