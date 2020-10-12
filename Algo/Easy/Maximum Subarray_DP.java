class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        
        int[] dp = new int[nums.length+1];
        
        dp[0] = 0;
        dp[1] = nums[0];
        
        int globalMax = nums[0];
        
        for(int i=2; i<nums.length+1; i++){
            dp[i] = Math.max(nums[i-1], nums[i-1]+dp[i-1]);
            globalMax = Math.max(dp[i], globalMax);
        }
        
        return globalMax;
    }
}