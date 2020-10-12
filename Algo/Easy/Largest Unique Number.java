class Solution {
    public int largestUniqueNumber(int[] A) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<A.length; i++){
            int count = map.getOrDefault(A[i], 0)+1;
            map.put(A[i], count);
        }
        
        int maxVal = -1;
        
        for(int i=0; i<A.length; i++){
            if(map.get(A[i])==1){
                maxVal = Math.max(maxVal, A[i]);
            }
        }
        
        if(maxVal == -1) return -1;
        
        return maxVal;
    }
}