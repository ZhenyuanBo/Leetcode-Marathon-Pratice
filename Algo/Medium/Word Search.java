class Solution {
    public boolean exist(char[][] board, String word) {
       boolean[][] visited = new boolean[board.length][board[0].length];
       for(int i=0; i<board.length; i++){
           for(int j=0; j<board[0].length; j++){
               if(board[i][j] == word.charAt(0)){
                   if(dfs(board, word, i, j, visited, 0)) return true;
               }
           }
       }
       return false;
    }
    private boolean dfs(char[][] board, String word, int r, int c, boolean[][] visited, int index){
        if(index==word.length()) return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || visited[r][c] || word.charAt(index)!=board[r][c]) return false;
        
        //forward track
        visited[r][c] = true;
        
        if(dfs(board, word, r+1, c, visited, index+1) || 
           dfs(board, word, r-1, c, visited, index+1) ||
           dfs(board, word, r, c+1, visited, index+1) ||
           dfs(board, word, r, c-1, visited, index+1))
            return true;
        
        //backtrack
        visited[r][c] = false;
        
        return false;
        
    }
}