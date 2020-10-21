class Solution {
    
    int[] arrNums = null;
    Random random = null;
    
    public Solution(int[] nums) {
        arrNums = nums;
        random = new Random();
    }
    
    public int pick(int target) {
        int count=0;
        int res=0;
        for(int i=0; i<arrNums.length; i++){
            if(arrNums[i]==target){
                if(random.nextInt(++count)==0) res=i;
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */