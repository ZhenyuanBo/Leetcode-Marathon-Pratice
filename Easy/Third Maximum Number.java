class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int count=2;
        int thirdMax=0;
        
        for(int i=nums.length-1; i>=0; i--){
            if(count==0){
                thirdMax=nums[i];
                break;
            }
            if(i-1>=0 && nums[i-1]!=nums[i]){
                count--;
            }
        }
        
        if(count>0) return nums[nums.length-1];
        
        return thirdMax;
    }
}