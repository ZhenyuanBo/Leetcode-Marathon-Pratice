class Solution {
    public int projectionArea(int[][] grid) {

        int topArea =0, yxArea=0, yzArea=0;

        for(int i=0; i<grid.length; i++){
            int rowMax=0;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]!=0) topArea++;
                rowMax = Math.max(rowMax, grid[i][j]);
            }

            yxArea += rowMax;
        }

        for(int i=0; i<grid[0].length; i++){
            int colMax=0;
            for(int j=0; j<grid.length; j++){
                colMax = Math.max(colMax, grid[j][i]);
            }
            yzArea += colMax;
        }

        return topArea + yxArea + yzArea;
    }
}