class Solution {
    public boolean isReflected(int[][] points) {
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        double y=0;
        
        for(int i=0; i<points.length; i++){
            if(map.get(points[i][1])==null){
                map.put(points[i][1], new TreeSet<Integer>());
            }
            map.get(points[i][1]).add(points[i][0]);
        }
        
        y = map.get(points[0][1]).size()==1 ? map.get(points[0][1]).pollFirst() : (map.get(points[0][1]).pollFirst() + map.get(points[0][1]).pollLast())/2.0;
        
        for(TreeSet<Integer> set: map.values()){
            while(!set.isEmpty()){
                if(set.size()!=1 && (set.pollFirst() + set.pollLast())/2.0!=y) return false;
                else if(set.size()==1 && set.pollFirst()!=y) return false;
            }
        }
        
        return true;
        
        
    }
}