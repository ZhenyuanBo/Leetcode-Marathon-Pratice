class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                int diff = Math.abs(prevIndex - i);
                if(diff<=k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}