class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numsCopy = nums.clone();
        Arrays.sort(numsCopy);
        
        int leftIndex=0, rightIndex=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=numsCopy[i]){
                leftIndex=i;
                break;
            }
        }
        
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]!=numsCopy[i]){
                rightIndex=i;
                break;
            }
        }
        
        if(rightIndex==0 && leftIndex==0) return 0;
        
        return rightIndex-leftIndex+1;
    }
}