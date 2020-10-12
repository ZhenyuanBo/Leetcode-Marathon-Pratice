class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1;
        
        while(low<high){
            int mid = low+(high-low)/2;
            if(target==nums[mid]) return mid;
            else if(target>nums[mid]){
                low=mid+1;
            }else if(target<nums[mid]){
                high=mid-1;
            }
        }
        
        if(target>nums[low]){
            return ++low;
        }else if(target<nums[low] && low>0){
            return low;
        }else if(target==nums[low]){
            return low;
        }
        
        return 0;
    }
}