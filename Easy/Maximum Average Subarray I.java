class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length==1) return nums[0];
        
        int maxSum = Integer.MIN_VALUE;
        
        // for(int i=0; i<nums.length; i++){
        //     int j=i;
        //     int sum=0;
        //     int upperLimit = j+k;
        //     while(j<upperLimit && upperLimit<=nums.length){
        //        sum+=nums[j]; 
        //        j++;
        //     }
        //     if(sum!=0) maxSum = Math.max(maxSum, sum);
        // }
        int sum=0;
        
        for(int i=0; i<nums.length; i++){
           if(i>=k){
              maxSum = Math.max(maxSum, sum);
              sum-=nums[i-k];
           }
           sum+=nums[i];
        }
        maxSum = Math.max(maxSum, sum);
        return (double)maxSum/k;
        
    }
}