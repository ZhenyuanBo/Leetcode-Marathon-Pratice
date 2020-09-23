class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        //calculate the max val for col and row for each value
        int[][] gridRowMax = new int[grid.length][grid[0].length];
        int[][] gridColMax = new int[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            int maxRow=0;
            int maxCol=0;
            for(int j=0; j<grid[0].length; j++){
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            for(int k=0; k<grid[0].length; k++){
                gridRowMax[i][k] = maxRow;
                gridColMax[k][i] = maxCol;
            }
        }
        
        int maxIncrease=0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int minHeight = Math.min(gridRowMax[i][j], gridColMax[i][j]);
                maxIncrease += minHeight - grid[i][j];
            }
        }
        
        return maxIncrease;
    }
}