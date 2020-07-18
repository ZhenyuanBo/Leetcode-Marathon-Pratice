class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m==0) return 0;
        int n = grid[0].length;
        
        Queue<Integer> neighbours = new LinkedList<>();
        int islandCount=0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    islandCount++;
                    grid[i][j] = '0';
                    neighbours.add(i*n + j);
                    while(!neighbours.isEmpty()){
                        int curr = neighbours.poll();
                        int r = curr / n;
                        int c = curr % n;

                        //look up
                        if(r-1>=0 && grid[r-1][c]=='1'){
                            neighbours.add((r-1)*n+c);
                            grid[r-1][c] = '0';
                        }
                        //look down
                        if(r+1<m && grid[r+1][c]=='1'){
                            neighbours.add((r+1)*n+c);
                            grid[r+1][c] = '0';
                        }
                        //look left
                        if(c-1>=0 && grid[r][c-1]=='1'){
                            neighbours.add((r)*n+(c-1));
                            grid[r][c-1] = '0';
                        }
                        //look right
                        if(c+1<n && grid[r][c+1]=='1'){
                            neighbours.add((r)*n+(c+1));
                            grid[r][c+1] = '0';
                        }
                    }
                }
            }
        }
        return islandCount;
    }
}

//solution 2:

class Solution {
    public class GridRowCol{
        int row;
        int col;
        public GridRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int numIslands(char[][] grid) {
        Queue<GridRowCol> queue = new LinkedList<>();
        if(grid.length==0) return 0;
        
        int numIsland=0;
        int[][] neiDir = {{0, 1}, {0, -1},{1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    numIsland++;
                    queue.add(new GridRowCol(i, j));
                    while(!queue.isEmpty()){
                        GridRowCol topItem = queue.poll();
                        for(int k=0; k<neiDir.length; k++){
                            int newR = topItem.row + neiDir[k][0];
                            int newC = topItem.col + neiDir[k][1];
                            if(newR<0 || newC<0 || newR>=grid.length || newC>=grid[0].length || grid[newR][newC]=='0' || visited[newR][newC]) continue;
                            if(!visited[newR][newC]){
                                queue.add(new GridRowCol(newR, newC));
                                visited[newR][newC] = true;
                            }  
                        }
                    }
                }
            }
        }
        
        return numIsland;
    }
}
//DFS
class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        
        int numIsland=0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1') numIsland++;
                DFS(grid, i, j);
            }
        }
        
        return numIsland;
    }
    private void DFS(char[][] grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0') return;
        
        grid[r][c] = '0';
        DFS(grid, r-1, c);
        DFS(grid, r+1, c);
        DFS(grid, r, c-1);
        DFS(grid, r, c+1);
    }
}