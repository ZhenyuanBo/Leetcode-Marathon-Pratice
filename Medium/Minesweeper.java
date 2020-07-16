class Solution {
    
    public class BoardRowCol{
        int row;
        int col;
        public BoardRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    
    public char[][] updateBoard(char[][] board, int[] click) {
        if(board==null || board.length==0 || board[0].length==0) return board;
        
        int row = click[0];
        int col = click[1];
        
        if(board[row][col]=='M'){
            board[row][col] = 'X';
            return board;
        }
        
        int[][] neiDirection = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        Queue<BoardRowCol> queue = new LinkedList<>();
        
        queue.add(new BoardRowCol(row, col));
        
        while(!queue.isEmpty()){
            BoardRowCol pos = queue.poll();
            int numMines=0;
            for(int i=0; i<neiDirection.length; i++){
                int newRow = pos.row + neiDirection[i][0];
                int newCol = pos.col + neiDirection[i][1];
                
                if(newRow<0 || newCol<0 || newRow>=board.length || newCol>=board[0].length) continue;
                if(board[newRow][newCol]=='M'){
                    numMines++;
                }
            }
            
            if(numMines>0){
                board[pos.row][pos.col] = (char)(numMines+'0');
            }else{
                board[pos.row][pos.col] = 'B';
                //add neis
                for(int i=0; i<neiDirection.length; i++){
                    int newRow = pos.row + neiDirection[i][0];
                    int newCol = pos.col + neiDirection[i][1];
                    if(newRow<0 || newCol<0 || newRow>=board.length || newCol>=board[0].length || visited[newRow][newCol]) continue;
                    visited[newRow][newCol] = true;
                    queue.add(new BoardRowCol(newRow, newCol));
                }
            }
        }
        
        return board;
        
    }
}