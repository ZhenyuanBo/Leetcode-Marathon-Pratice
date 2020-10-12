class Solution {
    public int countSquares(int[][] matrix) {
      int len=matrix[0].length;
      int count=0;
      while(len>=1){
        if(matrix.length<len || matrix[0].length<len){
            len--;
            continue;
        }
        for(int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix[0].length; j++){
             if(len==1 && matrix[i][j]==1) count++;
             else if(matrix[i][j]==1 && isSquare(matrix, i, j, len)){
                 count++;
             }
          }
        }
        len--;
      }
      return count;
    }
    private boolean isSquare(int[][] matrix, int r, int c, int side){
        if(r+side>matrix.length || c+side>matrix[0].length) return false;
        for(int i=r; i<r+side; i++){
            for(int j=c; j<c+side; j++){
                if(matrix[i][j]!=1) return false;
            }
        }
        return true;
    }
}