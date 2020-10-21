class Solution {
    
    boolean[][] seen;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;
        int maxVal = 0;
        seen = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++){
                maxVal = Math.max(maxVal, areaCalculator(i,j, grid));
            }
        }
        return maxVal;
    }
    
    public int areaCalculator(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || seen[i][j] || grid[i][j]==0) return 0;
        seen[i][j]=true;
        return 1+areaCalculator(i-1,j,grid) + areaCalculator(i+1,j,grid) + areaCalculator(i, j-1, grid) + areaCalculator(i, j+1, grid);
    }
}
/*
using Depth-First Search 
*/