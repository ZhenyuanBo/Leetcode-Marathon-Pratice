class Solution {
    public int fixedPoint(int[] A) {
        int val=-1;
        for(int i=0; i<A.length; i++){
            if(A[i]==i){
                val=i;
                break;
            }
        }
        if(val==-1){
            return -1;
        }
        return val;
    }
}