class Solution {
    public int numberOfBoomerangs(int[][] points) {
        //set up a map first
        Map<Integer, Integer> disMap = new HashMap<Integer, Integer>();
        int res=0;
        
        for(int i=0;i<points.length;i++){
            
            for(int j=0; j<points.length;j++){
                if(i==j) continue;
                
                int dis = distCalc(points[i],points[j]);
                disMap.put(dis, disMap.getOrDefault(dis,0)+1);
            }
            
            for(Integer val: disMap.keySet()){
                res+=disMap.get(val)*(disMap.get(val)-1);
            }
            
            disMap.clear();
        }
        
        return res;
    }
    private int distCalc(int[] a, int[]b){
        int disA = a[0]-b[0];
        int disB = a[1]-b[1];
        return disA*disA + disB*disB;
    }
}