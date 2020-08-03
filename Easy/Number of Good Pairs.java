class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                list.add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        
        System.out.println(map);
        
        int totalNumPair=0;
        
        for(Integer key: map.keySet()){
            int numPair = map.get(key).size()*(map.get(key).size()-1) / 2;
            totalNumPair += numPair;
        }
        
        return totalNumPair;
    }
}