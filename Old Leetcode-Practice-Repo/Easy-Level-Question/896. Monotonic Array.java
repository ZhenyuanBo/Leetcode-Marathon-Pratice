class Solution {
    public boolean isMonotonic(int[] A) {
        boolean isPrevIncreasing=false;
        boolean isPrevDecreasing=false;
        for(int i=1; i<A.length; i++){
            if(A[i]>A[i-1]){
                if(isPrevDecreasing) return false;
                isPrevIncreasing=true;
            }else if(A[i]<A[i-1]){
                if(isPrevIncreasing) return false;
                isPrevDecreasing=true;
            }
        }
        return true;
    }
}

//solution:
class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }
}