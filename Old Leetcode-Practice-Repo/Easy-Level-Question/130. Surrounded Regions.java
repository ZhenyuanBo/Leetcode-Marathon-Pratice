class Solution {
    //using Depth-First Search
    public void solve(char[][] board) {

        if(board.length==0 || board[0].length==0) return;
        if(board.length<2 || board[0].length<2) return;
        
        //start from first and last col
        for(int i=0; i<board.length; i++){
            if(board[i][0]=='O'){
                borderMark(i, 0, board);
            }
            if(board[i][board[0].length-1]=='O'){
                borderMark(i, board[0].length-1, board);
            }
        }
        
        //start from first and bottom row
        for(int j=0; j<board[0].length; j++){
            if(board[0][j]=='O'){
                borderMark(0, j, board);
            }
            if(board[board.length-1][j]=='O'){
                borderMark(board.length-1, j, board);
            }
        }
        
        //go through each point and check which one is '*' and which one still stays at 'O';
        //the one that still stays at 'O' have no connection with '*' (the ones at the border);
        //the one that is connected to border 'O' are all marked with '*'
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    
    public void borderMark(int r, int c, char[][] board){
        if(r<0 || r>board.length-1 || c<0 || c>board[0].length-1) return;
        //mark the 'O's at the border to '*'
        if(board[r][c]=='O'){
            board[r][c]='*';
        }
        //go through each internal point and check
        if(r>1 && board[r-1][c]=='O'){
            borderMark(r-1, c, board);
        }
        if(r<board.length-2 && board[r+1][c]=='O'){
            borderMark(r+1, c, board);
        }
        if(c>1 && board[r][c-1]=='O'){
            borderMark(r, c-1, board);
        }
        if(c<board[0].length-2 && board[r][c+1]=='O'){
            borderMark(r, c+1, board);
        }
    }
}