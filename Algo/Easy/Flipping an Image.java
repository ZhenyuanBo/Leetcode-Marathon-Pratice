class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++){
            int len = A[i].length;
            int[] arr = new int[len];
            for(int j=0; j<arr.length; j++){
                if(A[i][len-j-1]==0){
                    arr[j]=1;
                }else{
                    arr[j]=0;
                }
            }
            A[i] = arr;
        }
        return A;
    }
}