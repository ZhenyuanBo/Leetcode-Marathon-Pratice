class Solution {
    
    public double findMaxAverage(int[] nums, int k) {
        
        double currAverage=0;
        double currMax = (double)Integer.MIN_VALUE;
        double total=0;
        
        for(int i=0; i<k; i++){
            total+=nums[i];
        }
        
        currMax = Math.max(total, currMax);
        
        /*use sliding window to calculate the sum; subtract one from the previous one and add one from the next set*/
        for(int i=k; i<nums.length; i++){
            total = total + nums[i] - nums[i-k];
            currMax = Math.max(currMax, total);
        }
        
        return currMax/k;
    }
}