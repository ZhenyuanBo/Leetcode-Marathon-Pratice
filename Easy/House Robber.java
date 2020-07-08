class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        
        int[] dp = new int[nums.length+1];
        
        Arrays.fill(dp, -1);
        
        dp[nums.length] = 0;
        dp[nums.length-1] = nums[nums.length-1];
        dp[nums.length-2] = Math.max(nums[nums.length-1], nums[nums.length-2]);
        
        return maxCalc(nums, 0, dp);
    }
    private int maxCalc(int[] nums, int start, int[] dp){
        
        if(dp[start] != -1) return dp[start];

        int amount1 = nums[start] + maxCalc(nums, start+2, dp);
        int amount2 = nums[start+1] + maxCalc(nums, start+3, dp);
        
        dp[start] = Math.max(amount1, amount2);
       
        return dp[start];
    }
}