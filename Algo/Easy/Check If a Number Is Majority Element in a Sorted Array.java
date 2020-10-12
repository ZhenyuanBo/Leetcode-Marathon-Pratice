class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
       int count=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]==target){
               count++;
           }
       }
       if(count>nums.length/2){
           return true;
       }
        
       return false;
    }
}