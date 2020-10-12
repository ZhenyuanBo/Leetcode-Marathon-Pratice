class Solution {
    public int maxSubArray(int[] nums) {
        int l=0;
        int r=nums.length-1;
        return findMax(nums, l, r);
    }
    private int findMax(int[] nums, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            int leftMax = findMax(nums, l, m);
            int rightMax = findMax(nums, m+1, r);
            int crossMax = findCrossmax(nums, l, m, r);
            return Math.max(Math.max(leftMax, rightMax), crossMax);
        }else{
            return nums[l];
        }
    }
    private int findCrossmax(int[] nums, int l, int m, int r){
        
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        
        int sumLeft=0, sumRight=0;
        
        for(int i=m; i>=l; i--){
            sumLeft+=nums[i];
            leftMax = Math.max(leftMax, sumLeft);
        }
        
        for(int i=m+1; i<=r; i++){
            sumRight+=nums[i];
            rightMax = Math.max(rightMax, sumRight);
        }
        
        return leftMax + rightMax;
        
    }
}