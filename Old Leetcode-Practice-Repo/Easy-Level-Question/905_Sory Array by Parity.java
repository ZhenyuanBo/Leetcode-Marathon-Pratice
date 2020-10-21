class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int j=0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                result[j]=A[i];
                A[i]=-1;
                j++;
            }
        }
        for(int k=0; j<A.length; k++){
            if(A[k]!=-1){
                result[j] = A[k];
                j++;
            }
        }
        return result;
    }
}