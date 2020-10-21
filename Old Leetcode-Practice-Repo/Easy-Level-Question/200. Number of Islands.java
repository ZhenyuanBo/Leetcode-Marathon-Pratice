class Solution {
    boolean[][] seen;
    
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        seen = new boolean[grid.length][grid[0].length];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1' && !seen[i][j]){
                    islandCounter(i,j,grid);
                    count++;
                    System.out.println("i: " + i + " j: " + j + " Count: " + count);
                }
            }
        }
        
        return count;
    }
    
    public void islandCounter(int r, int c, char[][] grid){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || seen[r][c] || grid[r][c]=='0') return;
        seen[r][c]=true;
        islandCounter(r-1, c, grid);
        islandCounter(r, c+1, grid);
        islandCounter(r+1, c, grid);
        islandCounter(r, c-1,  grid); 
    }
}