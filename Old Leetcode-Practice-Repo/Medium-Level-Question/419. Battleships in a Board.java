class Solution {
    public int countBattleships(char[][] board) {
        
        int rows = board.length;
        int cols = board[0].length;
        int counter=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j>0 && board[i][j-1]=='X') continue;
                else if(i>0 && board[i-1][j]=='X') continue;
                else if(board[i][j]=='X'){
                    counter++;
                }
            }
        }
        return counter;
    }
}