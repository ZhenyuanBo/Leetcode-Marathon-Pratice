class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> finalList = new ArrayList<Integer>();
        int zeroCount=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                finalList.add(nums[i]);
            }else{
                zeroCount++;
            }
        }
        
        for(int i=0; i<zeroCount; i++){
            finalList.add(0);
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = finalList.get(i);
        }
    }
}