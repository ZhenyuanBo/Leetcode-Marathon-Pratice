class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public int binarySearch(int[] nums, int start, int end, int target){
        if(start > end) return -1;
        int mid = start + (end-start)/2;
        if(nums[mid] == target) return mid;
        
        if(nums[start]<=nums[mid] && target<=nums[mid] && target>=nums[start]){
            return binarySearch(nums, start, mid-1, target);
        }else if(nums[mid]<=nums[end] && target>=nums[mid] && target<=nums[end]){
            return binarySearch(nums, mid+1, end, target);
        }else if(nums[end]<=nums[mid]){
            return binarySearch(nums, mid+1, end, target);
        }else if(nums[start]>=nums[mid]){
            return binarySearch(nums, start, mid-1, target);
        }
        
        return -1;
    }
}