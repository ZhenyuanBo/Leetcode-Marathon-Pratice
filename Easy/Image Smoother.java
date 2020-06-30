class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                int sum=M[i][j];
                int neighborNum=1;
                //left
                if(j-1>=0){
                    sum+=M[i][j-1];
                    neighborNum++;
                }
                //right
                if(j+1<M[0].length){
                    sum+=M[i][j+1];
                    neighborNum++;
                }
                //up
                if(i-1>=0){
                    sum+=M[i-1][j];
                    neighborNum++;
                }
                //down
                if(i+1<M.length){
                    sum+=M[i+1][j];
                    neighborNum++;
                }
                //diagonal - top-left
                if(i-1>=0 && j-1>=0){
                    sum+=M[i-1][j-1];
                    neighborNum++;
                }
                //diagonal - bottom-right
                if(i+1<M.length && j+1<M[0].length){
                    sum+=M[i+1][j+1];
                    neighborNum++;
                }
                //diagonal - top-right
                if(i-1>=0 && j+1<M[0].length){
                    sum+=M[i-1][j+1];
                    neighborNum++;
                }
                //diagonal - bottom-left
                if(i+1<M.length && j-1>=0){
                    sum+=M[i+1][j-1];
                    neighborNum++;
                }
                
                res[i][j] = sum/neighborNum;
            }
        }
        return res;
    }
}