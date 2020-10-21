class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        int result=0;
        
        for(int i=0; i<grid.length-2; i++){
            for(int j=0; j<grid[0].length-2; j++){
                if(magicCheck(grid[i][j], grid[i][j+1], grid[i][j+2], grid[i+1][j], grid[i+1][j+1], grid[i+1][j+2],
                             grid[i+2][j], grid[i+2][j+1], grid[i+2][j+2])){
                    result++;
                }
            }
        }
        
        return result;
    }
    private boolean magicCheck(int... vals){
        //check if the numbers are unique:
        Set<Integer> set = new HashSet<Integer>();
        for(int val: vals){
            if(val==0) return false;
            if(!set.add(val)) return false;
        }
        if(vals[0]+vals[1]+vals[2]==15 && 
           vals[3]+vals[4]+vals[5]==15 && 
           vals[6]+vals[7]+vals[8]==15 &&
           vals[0]+vals[4]+vals[8]==15 &&
           vals[1]+vals[4]+vals[7]==15 &&
           vals[2]+vals[4]+vals[6]==15 &&
           vals[0]+vals[3]+vals[6]==15 &&
           vals[2]+vals[5]+vals[8]==15){
            return true;
        }else{
            return false;
        }
    }
}