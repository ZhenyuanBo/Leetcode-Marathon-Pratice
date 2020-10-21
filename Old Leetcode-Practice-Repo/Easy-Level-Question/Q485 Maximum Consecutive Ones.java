class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int numOnes=0;
        int currMax=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                numOnes++;
            }else{
                currMax = Math.max(currMax, numOnes);
                numOnes=0;
            }
        }
        
        return Math.max(currMax, numOnes);
    }
}