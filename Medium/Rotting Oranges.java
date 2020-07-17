class Solution {
    public class GridRowCol{
        int row;
        int col;
        public GridRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int orangesRotting(int[][] grid) {
        
        Queue<GridRowCol> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numFresh=0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    visited[i][j] = true;
                    queue.add(new GridRowCol(i, j));
                }else if(grid[i][j]==1){
                    numFresh++;
                }
            }
        }
        
        int[][] dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        
        int min=-1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int j=0; j<size; j++){
                GridRowCol topOrange = queue.poll();
                int topR = topOrange.row;
                int topC = topOrange.col;
                for(int i=0; i<dir.length; i++){
                    int neiR = topR + dir[i][0];
                    int neiC = topC + dir[i][1];
                if(neiR<0||neiR>=grid.length||neiC<0||neiC>=grid[0].length||visited[neiR][neiC]||grid[neiR][neiC]==0) continue;
                    if(!visited[neiR][neiC]){
                        if(grid[neiR][neiC]==1){
                            grid[neiR][neiC]=2;
                            queue.add(new GridRowCol(neiR, neiC));
                            visited[neiR][neiC] = true;
                        }
                    }
                }
            }
            min++;
        }
        
        if(min==-1 && numFresh==0) return 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        
        return min;
    }
}