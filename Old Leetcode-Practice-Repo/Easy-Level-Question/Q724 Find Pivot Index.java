class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = num[0];
        int rightSum = rightSumCalc(nums,2); 
        
        for(int i=1;i<nums.length;i++){
            if(rightSumCalc(nums,i+1) == leftSum){
                return i;
            }else{
                leftSum+=num[i];
            }
        }
        
        return -1;
    }
    private int rightSumCalc(int[] nums, int startIndex){
        int rightSum=0;
        
        while(startIndex<nums.length){
            rightSum += nums[startIndex];
            startIndex++;
        }
        
        return rightSum;
    }
    
}