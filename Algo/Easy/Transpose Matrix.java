class Solution {
    public int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        
        for(int c=0; c<A[0].length; c++){
            for(int r=0; r<A.length; r++){
                res[c][r] = A[r][c];
            }
        }
        
        return res;
    }
}