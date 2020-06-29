class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length==1) return true;
        
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                if(r+1<matrix.length && c+1<matrix[0].length){
                    if(matrix[r][c] != matrix[r+1][c+1]) return false;
                }
            }
        }
        
        return true;
    }
}