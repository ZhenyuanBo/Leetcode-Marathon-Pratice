class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int prev=nums[0];
        
        int count=1;
        int majorityElement=nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=prev){
                count=1;
            }else{
                count++;
                if(count>nums.length/2){
                    majorityElement = nums[i];
                    break;
                }
            }
            prev = nums[i];
        }
        
        return majorityElement;
    }
}