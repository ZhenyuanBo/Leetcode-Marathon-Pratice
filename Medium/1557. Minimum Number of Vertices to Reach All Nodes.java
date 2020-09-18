class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> reslist = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<edges.size(); i++){
            int from = edges.get(i).get(0);
            if(map.containsKey(from)){
                map.get(from).add(edges.get(i).get(1));
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(edges.get(i).get(1));
                map.put(from, list);
            }
        }
        
        Set<Integer> toSet = new HashSet<>();
        
        for(Integer key: map.keySet()){
            List<Integer> list = map.get(key);
            for(int i=0; i<list.size(); i++){
                toSet.add(list.get(i));
            }
        }
        
        for(int i=0; i<n; i++){
            if(!toSet.contains(i)){
                reslist.add(i);
            }
        }
        
        return reslist;
        
    }
}