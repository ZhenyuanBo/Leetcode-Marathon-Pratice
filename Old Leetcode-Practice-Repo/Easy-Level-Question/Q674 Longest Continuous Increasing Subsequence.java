class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int longestLen = 1;
        int currLen = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                currLen++;
                longestLen = Math.max(currLen, longestLen);
            }else{
                currLen=1;
            }
        }
        return longestLen;
    }
}