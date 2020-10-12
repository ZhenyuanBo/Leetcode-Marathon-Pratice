class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++){
            String numRep = Integer.toString(nums[i]);
            if(numRep.length() %2 == 0){
                res++;
            }
        }
        return res;
    }
}