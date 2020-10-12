class Solution {
    public int dominantIndex(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxVal = Math.max(nums[i], maxVal);
        }
        boolean isTwiceLarger = true;
        int largestValIndex=-1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=maxVal){
                if(nums[i]!=0 && maxVal/nums[i] < 2){
                    isTwiceLarger = false;
                    break;
                }
            }else{
                largestValIndex = i;
            }
        }
        
        if(isTwiceLarger) return largestValIndex;
        
        return -1;
    }
}