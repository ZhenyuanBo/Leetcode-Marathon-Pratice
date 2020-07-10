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