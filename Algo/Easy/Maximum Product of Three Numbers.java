class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int firstVal = nums[nums.length-1];
        int maxProduct = Integer.MIN_VALUE;
        
        int i=nums.length-1;
        
        while(i-2>=0){
            maxProduct = Math.max(maxProduct, firstVal * nums[i-1] * nums[i-2]);
            i--;
        }
        
        return maxProduct;
    }
}