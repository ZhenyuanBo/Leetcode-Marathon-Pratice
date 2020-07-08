class NumArray {
    private int[][] dp;
    
    public NumArray(int[] nums) {
       dp = new int[nums.length][nums.length];
       for(int i=0; i<dp.length; i++){
           for(int j=0; j<dp[0].length; j++){
               if(i>j) dp[i][j] = 0;
               else if(i==j) dp[i][j] = nums[j];
               else if(i<j)
                  dp[i][j] = nums[j] + dp[i][j-1]; 
           }
       }
    }
    
    public int sumRange(int i, int j) {
        return dp[i][j];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */