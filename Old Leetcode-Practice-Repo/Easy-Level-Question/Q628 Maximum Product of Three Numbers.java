class Solution {
    public int maximumProduct(int[] nums) {
        
        if(nums.length==0) return 0;
        
        Arrays.sort(nums);
        
        int max = Integer.MIN_VALUE;
        
        int firstVal = nums[nums.length-1];
        
        int i=nums.length-2;
        
        while(i-1>=0){
            max = Math.max(max, firstVal * nums[i] * nums[i-1]);
            i--;
        }
        
        return max;
    }
}