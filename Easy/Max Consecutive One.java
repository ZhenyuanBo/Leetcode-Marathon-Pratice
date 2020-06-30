class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevVal = nums[0];
        
        if(prevVal==1) count++;
        
        int maxCount=Integer.MIN_VALUE;
        
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==prevVal && nums[i]==1){
                count++;
            }else if(nums[i]!=prevVal){
                maxCount = Math.max(maxCount, count);
                count=0;
                if(nums[i]==1) count++;
            }
            prevVal = nums[i];
        }
        
        return Math.max(maxCount, count);
    }
}