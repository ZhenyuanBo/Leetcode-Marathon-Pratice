class Solution {
    public boolean validMountainArray(int[] A) {
        
        if(A.length<3) return false;
        
        if(A[1]<A[0]) return false;
        
        int prev = A[1];
        boolean isIncreasing=true;
        boolean isDecreasing=false;
        
        for(int i=2; i<A.length; i++){
           if(isIncreasing && !isDecreasing && A[i]<A[i-1]){
               isDecreasing = true;
           }else if(isDecreasing && A[i]>A[i-1]){
               return false;
           }else if(A[i]==A[i-1]){
               return false;
           } 
        }
        
        return isIncreasing && isDecreasing;
    }
}