class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumList = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            //mark consecutive numbers to negative
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val] = -nums[val];
            }
        }
        //index + 1 = value at a particular position
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missingNumList.add(i+1);
            }
        }
        
        return missingNumList;
    }
}