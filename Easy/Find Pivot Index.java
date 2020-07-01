class Solution {
    public int pivotIndex(int[] nums) {
        int index=-1;
        
        for(int i=0; i<nums.length; i++){
            if(leftSum(nums, i-1) == rightSum(nums, i+1)){
                index = i;
                break;
            }
        }
        
        return index;
    }
    private int leftSum(int[] nums, int index){
        int leftSum=0;
        
        for(int i=0; i<=index; i++){
            leftSum+=nums[i];
        }
        
        return leftSum;
    }
    private int rightSum(int[] nums, int index){
        int rightSum=0;
        
        for(int i=index; i<nums.length; i++){
            rightSum += nums[i];
        }
        
        return rightSum;
    }
}
//solution #2:
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        
        int[] cumulativeSum = new int[nums.length];
        cumulativeSum[0] = 0;
        int sum=nums[0];
        int j=1;
        
        for(int i=1;i<nums.length; i++){
            cumulativeSum[j] = cumulativeSum[j-1] + nums[i-1];
            sum+=nums[i];
            j++;
        }
        
        int pivot = -1;
        for(int i=0; i<nums.length; i++){
            int leftSum = cumulativeSum[i];
            int rightSum = sum-nums[i]-leftSum;
            if(leftSum == rightSum){
                pivot=i;
                break;
            }
        }
        return pivot;
    }
}