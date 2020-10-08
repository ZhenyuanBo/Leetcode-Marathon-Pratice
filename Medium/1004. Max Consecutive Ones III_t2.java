class Solution {
    public int longestOnes(int[] A, int K) {
        int maxLen=0;
        int j=0;
        int numOnes=0;
        
        for(int i=0; i<A.length; i++){
            if(A[i]==1){
                numOnes++;
            }
            
            while(i-j-numOnes+1>K){
                if(A[j]==1){
                    numOnes--;
                }
                j++;
            }
            
            maxLen = Math.max(maxLen, i-j+1);
        }
        
        return maxLen;
    }
}