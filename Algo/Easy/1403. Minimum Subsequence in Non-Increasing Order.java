class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        
        for(int i=nums.length-2; i>=0; i--){
            if(!isGreater(0, i, list, nums)){
                list.add(nums[i]);
            }else{
                break;
            }
        }
        
        return list;
    }
    private boolean isGreater(int s, int e, List<Integer> list, int[] nums){

        int currSum=0;
        int remainSum=0;
        
        for(int i=0; i<list.size(); i++){
            currSum += list.get(i);
        }

        for(int i=s; i<=e; i++){
            remainSum += nums[i];
        }

        if(currSum>remainSum) return true;
        
        return false;
    }
}