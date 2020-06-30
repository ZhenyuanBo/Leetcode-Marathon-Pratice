class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true;
        }
        
        return false;
    }
}