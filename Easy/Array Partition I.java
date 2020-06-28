class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int val=0;
        for(int i=0; i<nums.length;){
            val+=Math.min(nums[i], nums[i+1]);
            i+=2;
        }
        return val;
    }
}