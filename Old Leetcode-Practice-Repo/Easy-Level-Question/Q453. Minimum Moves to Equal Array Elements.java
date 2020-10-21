class Solution {
    public int minMoves(int[] nums) {
        //find the minimum value
        //subtract the minimum value from each value and add the differences up
        int min = Integer.MAX_VALUE;
        for(int n: nums){
            min = Math.min(min, n);
        }
        
        int res=0;
        
        for(int n:nums){
            res += n-min;
        }
        
        return res;
    }

}