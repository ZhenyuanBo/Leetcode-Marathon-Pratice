class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int numElements = nums.length;
        
        int count=0;
        int missingNum=-1;
        int index=0;
        
        while(count<=numElements){
            if(index>nums.length-1){
                return nums[index-1]+1;
            }else if(nums[index]!=index){
                missingNum=index;
                break;
            }
            
            count++;
            index++;
        }
        
        return missingNum;
    }
}