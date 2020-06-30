class Solution {
    public boolean isMonotonic(int[] A) {
        
        if(A.length<=1) return true;
        
        boolean isIncreasing=false;
        boolean isDecreasing=false;
        
        if(A[0]<A[1]){
            isIncreasing=true;
        }else if(A[0]>A[1]){
            isDecreasing=true;
        }
        
        for(int i=1; i<A.length-1; i++){
            if(isIncreasing && A[i]>A[i+1]){
                return false;
            }else if(isDecreasing && A[i]<A[i+1]){
                return false;
            }else{
                if(A[i]<A[i+1]) isIncreasing=true;
                else if(A[i]>A[i+1]) isDecreasing=true;
            }
        }
        
        return true;
    }
}