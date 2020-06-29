class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[][] newGrid = new int[grid.length][grid[0].length];
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        
        for(int i=0; i<k; i++){
            for(int r=0; r<grid.length; r++){
                int c=0;
                for(c=0; c<grid[0].length-1; c++){
                    newGrid[r][c+1] = grid[r][c];
                }
                if(r+1<grid.length && c==grid[0].length-1){
                    newGrid[r+1][0]=grid[r][c];
                }else if(r+1==grid.length && c==grid[0].length-1){
                    newGrid[0][0] = grid[r][c];
                }
            }
            
            for(int r=0; r<grid.length; r++){
                for(int c=0; c<grid[0].length; c++){
                    grid[r][c] = newGrid[r][c];
                }
            }
        }
        
        for(int i=0; i<newGrid.length; i++){
            List<Integer> rowList = new ArrayList<Integer>();
            if(k>0){
                for(int j=0; j<newGrid[i].length; j++){
                    rowList.add(newGrid[i][j]);
                }
            }else{
                for(int j=0; j<grid[i].length; j++){
                    rowList.add(grid[i][j]);
                }
            }
            resList.add(rowList);
        }
        
        return resList;
    }
}