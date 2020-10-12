class Solution {
    public int findMin(int[] nums) {
       int minVal = Integer.MAX_VALUE;
        
       for(int num: nums){
           if(num<minVal){
               minVal = num;
           }
       }
        
       return minVal;
    }
}

//using binary search
//find the inflection point - point of change (from high to low or low to high)
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        
        if(nums[left]<nums[right]) return nums[left];
        
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[0]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        
        return nums[left];
    }
}
