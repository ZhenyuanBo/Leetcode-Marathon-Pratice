class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        
        for(int i:nums){
            numsMap.put(i, numsMap.getOrDefault(i,0)+1);
        }
        
        int numTimes = (nums.length)/2;
        int ans=0;
        
        for(Integer i: numsMap.keySet()){
            if(numsMap.get(i)>numTimes){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}