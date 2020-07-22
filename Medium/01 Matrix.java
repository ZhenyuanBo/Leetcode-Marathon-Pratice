class Solution {
    public class MatrixRowCol{
        int row;
        int col;
        public MatrixRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] updateMatrix(int[][] matrix) {
        //BFS
        Queue<MatrixRowCol> q = new LinkedList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] neiDirection = {{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==1){
                    matrix[i][j] = Integer.MAX_VALUE;
                }else{
                    q.add(new MatrixRowCol(i, j));
                    visited[i][j] = true;
                }
            }
        }
        
        while(!q.isEmpty()){
            MatrixRowCol topVal = q.poll();
            int r = topVal.row;
            int c = topVal.col;
            for(int i=0; i<neiDirection.length; i++){
                int newR = r + neiDirection[i][0];
                int newC = c + neiDirection[i][1];
                if(newR<0||newC<0||newR>=matrix.length||newC>=matrix[0].length||visited[newR][newC]) continue;
                
                int dis = matrix[r][c] + 1;
                
                if(matrix[newR][newC]>dis){
                    matrix[newR][newC] = dis;
                    q.add(new MatrixRowCol(newR, newC));
                    visited[newR][newC] = true;
                }
            }
        }
        
        return matrix;
        
    }
}