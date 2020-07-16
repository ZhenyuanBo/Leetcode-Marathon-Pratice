class Solution {
    public class MazeRowCol{
        int row;
        int col;
        public MazeRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        Queue<MazeRowCol> queue = new LinkedList<>();
        queue.add(new MazeRowCol(start[0], start[1]));
        int[][] neiDirection = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            MazeRowCol topRowCol = queue.poll();
            int r = topRowCol.row;
            int c = topRowCol.col;
            if(r==destination[0] && c==destination[1]) return true;
            for(int i=0; i<neiDirection.length; i++){
                int newR = r + neiDirection[i][0];
                int newC = c + neiDirection[i][1];
                while(newR>=0 && newC>=0 && newR<maze.length && newC<maze[0].length && maze[newR][newC]==0){
                    //keep rolling
                    newR = newR + neiDirection[i][0];
                    newC = newC + neiDirection[i][1];
                }
                if(!visited[newR-neiDirection[i][0]][newC-neiDirection[i][1]]){
                    visited[newR-neiDirection[i][0]][newC-neiDirection[i][1]] = true;
                    queue.add(new MazeRowCol(newR-neiDirection[i][0], newC-neiDirection[i][1]));
                }
            }
        }
        
        return false;
    }
}