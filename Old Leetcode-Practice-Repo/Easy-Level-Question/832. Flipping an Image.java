class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++){
            int lastIndex = A[i].length-1;
            for(int j=0; j<=lastIndex; j++){
                int temp = A[i][j];
                A[i][j] = A[i][lastIndex];
                A[i][lastIndex]=temp;
                lastIndex--;
            }
            for(int k=0; k<A[i].length; k++){
                if(A[i][k]==0){
                    A[i][k]=1;
                }else{
                    A[i][k]=0;
                }
            }
        }
        return A;
    }
}