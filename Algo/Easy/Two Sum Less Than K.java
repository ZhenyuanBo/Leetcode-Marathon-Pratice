class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i]+A[j]<K){
                    maxVal = Math.max(maxVal, A[i]+A[j]); 
                }
            }
        }
        if(maxVal == Integer.MIN_VALUE){
            return -1;
        }
        
        return maxVal;
    }
}

//solution
public int twoSumLessThanK(int[] A, int K) {
        if (A == null || A.length == 0) {
            return -1;
        }
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int largest = Integer.MIN_VALUE;
        while (i < j) {
            if (A[i] + A[j] >= K) {
                j--;
            } else {
                int cur = A[i] + A[j];
                largest = Math.max(cur, largest);
                i++;
            }
        }
        return largest == Integer.MIN_VALUE ? -1 : largest;
}