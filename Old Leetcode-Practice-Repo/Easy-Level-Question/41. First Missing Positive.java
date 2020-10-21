class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missingNum=0;
        int prev=0;
        boolean startWithOne=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                startWithOne = true;
                prev = nums[i];
                continue;
            }
            if(startWithOne && nums[i] == prev+1 ){
                prev=nums[i];
            }else if(startWithOne && nums[i] > prev+1){
                missingNum=prev+1;
                break;
            }
        }
        if(!startWithOne) return 1;
        else if(missingNum==0) return prev+1;
        else return missingNum;
        
    }
}