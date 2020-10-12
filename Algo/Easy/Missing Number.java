class Solution {
    public int missingNumber(int[] nums) {
        int[] ref = new int[nums.length+1];
        
        for(int i=0; i<nums.length; i++){
            ref[nums[i]] = -1;
        }
        
        int missing=-1;
        
        for(int i=0; i<ref.length; i++){
            if(ref[i]==0){
                missing=i;
            }
        }
        
        return missing;
        
    }
}