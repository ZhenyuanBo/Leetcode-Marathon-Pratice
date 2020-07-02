class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        
        int count=0;
        
        if(k==0){
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i: nums){
                int freq = map.getOrDefault(i, 0)+1;
                map.put(i, freq);
            }
            
            for(Integer key: map.keySet()){
                if(map.get(key)>1) ++count;
            }
            return count;
        }else{
            Set<Integer> set = new HashSet<Integer>();
            for(int i: nums){
                set.add(i);
            }
            Iterator<Integer> iterator = set.iterator();
            
            while(iterator.hasNext()){
                int val = iterator.next();
                int pair = val+k;
                if(set.contains(pair)){
                    ++count;
                }
            }
        }
        
        return count;
    }
}