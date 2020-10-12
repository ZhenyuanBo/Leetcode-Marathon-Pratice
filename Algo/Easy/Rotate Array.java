class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, nums.length);
        
        for(int i=0; i<nums.length; i++){
            int newIndex = i+k;
            if(newIndex>=nums.length){
                newIndex = newIndex%nums.length;
            }
            arr[newIndex] = nums[i];
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
}