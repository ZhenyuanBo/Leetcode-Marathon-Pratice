class Solution {
    public class GridRowCol{
        int row; 
        int col;
        public GridRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    visited[i][j] = true;
                    maxArea = Math.max(maxArea, areaCalculate(grid, i, j, visited));
                }
            }
        }
        return maxArea == Integer.MIN_VALUE ? 0: maxArea;
    }
    private int areaCalculate(int[][] grid, int i, int j, boolean[][] visited){
        Queue<GridRowCol> q = new LinkedList<>();
        q.add(new GridRowCol(i, j));
        int[][] neiDir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        int area=1;
        while(!q.isEmpty()){
            GridRowCol pos = q.poll();
            int r = pos.row;
            int c = pos.col;
            for(int k=0; k<4; k++){
                int neiR = r + neiDir[k][0];
                int neiC = c + neiDir[k][1];
                if(neiR<0||neiC<0||neiR>=grid.length||neiC>=grid[0].length||visited[neiR][neiC]||grid[neiR][neiC]==0) continue;
                if(grid[neiR][neiC]==1){
                    area++;
                    visited[neiR][neiC]=true;
                    q.add(new GridRowCol(neiR, neiC));
                }
            }
        }
        return area;
    }
}
//DFS SOLUTION:
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    maxArea = Math.max(maxArea, areaCalculate(grid, i, j, visited, 1));
                }
            }
        }
        return maxArea == Integer.MIN_VALUE ? 0: maxArea;
    }
    private int areaCalculate(int[][] grid, int i, int j, boolean[][] visited, int area){
        
        //base case
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j]==0) return 0;
        
        visited[i][j] = true;

        area+=areaCalculate(grid, i+1, j, visited, 1);
        area+=areaCalculate(grid, i-1, j, visited, 1);
        area+=areaCalculate(grid, i, j+1, visited, 1);
        area+=areaCalculate(grid, i, j-1, visited, 1);
        return area;
    }
}