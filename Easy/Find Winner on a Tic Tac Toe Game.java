class Solution {
    public String tictactoe(int[][] moves) {

        char[][] grid = new char[3][3];
        
        for(int i=0; i<moves.length; i++){
            int r=moves[i][0];
            int c=moves[i][1];
            
            if(i%2==0){
                grid[r][c] = 'X';
            }else{
                grid[r][c] = 'O';
            }
        }
        
        //horizontal
        for(int r=0; r<3; r++){
            int hrSum=0;
            for(int c=0; c<3; c++){
                if(grid[r][c]=='X'){
                    hrSum+=1;
                }else if(grid[r][c]=='O'){
                    hrSum+=-1;
                }
            }
            if(hrSum==3) return "A";
            else if(hrSum==-3) return "B";
        }
        
        //vertical
        for(int c=0; c<3; c++){
            int verSum=0;
            for(int r=0; r<3; r++){
                if(grid[r][c]=='X'){
                    verSum+=1;
                }else if(grid[r][c]=='O'){
                    verSum+=-1;
                }
            }
            if(verSum==3) return "A";
            else if(verSum==-3) return "B";
        }
        
        //diagonal top-left to bottom-right
        int diagonal1=0;
        for(int r=0; r<3; r++){
            if(grid[r][r]=='X'){
                diagonal1+=1;
            }else if(grid[r][r]=='O'){
                diagonal1+=-1;
            }
        }
        
        if(diagonal1==3) return "A";
        else if(diagonal1==-3) return "B";
        
        int diagonal2=0;
        int c=2;
        for(int r=0; r<3; r++){
            if(grid[r][c]=='X'){
                diagonal2+=1;
            }else if(grid[r][c]=='O'){
                diagonal2+=-1;
            }
            c--;
        }
        
        if(diagonal2==3) return "A";
        else if(diagonal2==-3) return "B";
        
        if(moves.length==9) return "Draw";
        
        
        return "Pending";
        
    }
}