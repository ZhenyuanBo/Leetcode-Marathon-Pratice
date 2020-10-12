class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean mod=false;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                if(mod) return false;
                else{
                    mod=true;
                    if(!(i+1>=nums.length || 
                         nums[i-1]<=nums[i+1] ||
                        i-2<0 || nums[i]>=nums[i-2])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}