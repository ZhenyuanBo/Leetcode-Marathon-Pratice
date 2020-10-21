class Solution {
    public boolean validMountainArray(int[] A) {
        
        boolean hasIncrease=false;
        boolean hasDecrease=false;
        
        if(A.length<=1) return false;
        
        int j=1;
        
        for(int i=0; i<A.length; i++){
            if(j<A.length){
                if(A[i]<A[j]){
                    if(hasDecrease) return false;
                    hasIncrease = true;
                }else if(A[i]>A[j]){
                    hasDecrease=true;
                }else{
                    return false;
                }
            }
            j++;
        }
        
        if(hasIncrease && hasDecrease) return true;
        else
            return false;
        
    }
}

//solution
// just walk through the array
class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}