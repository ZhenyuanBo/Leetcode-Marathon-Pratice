class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        
        for(int i: nums){
            numMap.put(i, numMap.getOrDefault(i,0)+1);
        }
        
        for(Integer i: numMap.keySet()){
            if(numMap.get(i)>=2) return true;
        }
        
        return false;
    }
}