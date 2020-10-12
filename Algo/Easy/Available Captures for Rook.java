class Solution {
    public int numRookCaptures(char[][] board) {
        //find the position of rook
        int rR=0, cR=0;
        int count=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]=='R'){
                    rR=i; cR=j;
                    break;
                }
            }
        }
        //move from position of Rook to top of the board
        for(int r=rR-1; r>=0; r--){
            if(board[r][cR]=='B'){
                break;
            }
            if(board[r][cR]=='p'){
                count++;
                break;
            }
        }
        //move from position of Rook to bottom of the board
        for(int r=rR+1; r<board.length; r++){
            if(board[r][cR]=='B'){
                break;
            }
            if(board[r][cR]=='p'){
                count++;
                break;
            }
        }
        //move from position of Rook to left of the board
        for(int c=cR-1; c>=0; c--){
            if(board[rR][c]=='B'){
                break;
            }
            if(board[rR][c]=='p'){
                count++;
                break;
            }
        }
        //move from position of Rook to right of the board
        for(int c=cR+1; c<board[0].length; c++){
            if(board[rR][c]=='B'){
                break;
            }
            if(board[rR][c]=='p'){
                count++;
                break;
            }
        }
        
        return count;
    }
}