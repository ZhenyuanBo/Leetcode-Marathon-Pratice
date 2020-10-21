class Solution {
    public int findShortestSubArray(int[] nums) {
        
        Map<Integer,Integer> leftMap = new HashMap(),
                             rightMap = new HashMap(),
                             countMap = new HashMap();
        
        for(int i=0; i<nums.length; i++){
            if(leftMap.get(nums[i]) == null) leftMap.put(nums[i], i);
            rightMap.put(nums[i],i);
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        
        int degree = Collections.max(countMap.values());
        int ans = nums.length;
        
        for(int i:nums){
            if(countMap.get(i) == degree){
                ans = Math.min(ans, rightMap.get(i) - leftMap.get(i)+1);
            }
        }
        
        return ans;
         
    }
}
