class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] P = new int[m];
        int[] res = new int[queries.length];
        for(int i=0; i<P.length; i++){
            P[i] = i+1;
        }
        for(int i=0; i<queries.length; i++){
            int index = targetIndex(P, queries[i]);
            res[i] = index;
            shuffleP(P, index);
        }
        
        return res;
    }
    private int targetIndex(int[] P, int target){
        int index=-1;
        
        for(int i=0; i<P.length; i++){
            if(P[i]==target){
                index=i;
                break;
            }
        }
        
        return index;
    }
    private void shuffleP(int[] P, int index){
        int[] pCopy = new int[P.length];
        pCopy[0] = P[index];
        
        for(int i=1; i<=index; i++){
            pCopy[i] = P[i-1];
        }
        
        for(int i=index+1; i<P.length; i++){
            pCopy[i] = P[i];
        }
        for(int i=0; i<pCopy.length; i++){
            P[i] = pCopy[i];
        }
    }
}