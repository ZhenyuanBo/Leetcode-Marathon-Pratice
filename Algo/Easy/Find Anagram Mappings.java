class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j]){
                    map.put(i, j);
                    break;
                }
            }
        }

        int[] p = new int[A.length];
        for(Integer key: map.keySet()){
            p[key] = map.get(key);
        }
        
        return p;
    }
}