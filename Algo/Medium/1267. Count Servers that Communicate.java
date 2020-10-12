class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1 && canCommunicate(grid, i, j)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
    private boolean canCommunicate(int[][] grid, int r, int c){
        //check the entire row
        for(int i=0; i<grid[0].length; i++){
            if(grid[r][i]==1 && i!=c) return true;
        }
        
        for(int i=0; i<grid.length; i++){
            if(grid[i][c]==1 && i!=r) return true;
        }
        
        return false;
    }
}