class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        //centre of the grid must be 5
        int r=grid.length, c=grid[0].length;
        
        int count=0;
        
        for(int i=0; i<r-2; i++){
            for(int j=0; j<c-2; j++){
                if(grid[i+1][j+1]!=5) continue;
                if(isMagic(grid[i][j], grid[i][j+1], grid[i][j+2], grid[i+1][j], grid[i+1][j+1], grid[i+1][j+2], grid[i+2][j], grid[i+2][j+1], grid[i+2][j+2])){
                    count++;
                }
            }
        }
        
        return count;
    }
    private boolean isMagic(int... vals){
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i: vals){
            if(set.contains(i) || i>9 || i<1) return false;
            set.add(i);
        }
        
        return (vals[0]+vals[1]+vals[2]==15 && 
                vals[3]+vals[4]+vals[5]==15 && 
                vals[6]+vals[7]+vals[8]==15 &&
                vals[0]+vals[3]+vals[6]==15 &&
                vals[1]+vals[4]+vals[7]==15 &&
                vals[2]+vals[5]+vals[8]==15 &&
                vals[0]+vals[4]+vals[8]==15 &&
                vals[2]+vals[4]+vals[6]==15
               );
    }
}