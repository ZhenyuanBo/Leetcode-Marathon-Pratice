class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int largestVal = nums[nums.length-1];
        int secLargestVal = nums[nums.length-2];
        int res = (largestVal-1) * (secLargestVal-1);
        return res;
    }
}