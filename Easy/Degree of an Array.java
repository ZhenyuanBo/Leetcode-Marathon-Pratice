class Solution {
    public int findShortestSubArray(int[] nums) {
        
        //calculate degree
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i: nums){
            int freq = map.getOrDefault(i, 0)+1;
            map.put(i, freq);
        }
        
        int maxFreq = Integer.MIN_VALUE;
        
        for(Integer val: map.values()){
            maxFreq = Math.max(maxFreq, val);
        }
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(Integer key: map.keySet()){
            if(map.get(key) == maxFreq) set.add(key);
        }
        
        int shortestVal=Integer.MAX_VALUE;
        
        for(Integer val: set){
            int i=0, j=nums.length-1;
            while(i<j){
                while(val!=nums[i] && i<j) i++;
                while(val!=nums[j] && i<j) j--;
                if(i<j){
                    shortestVal = Math.min(shortestVal, j-i+1);
                    break;
                }
            }
        }
        
        return shortestVal == Integer.MAX_VALUE ? 1 : shortestVal;
    }
}