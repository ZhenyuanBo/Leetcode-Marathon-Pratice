class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int count=0;
        
        int[][] res = new int[n][m];
        for(int i=0; i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j=0; j<m; j++){
                res[r][j]++;
            }
            for(int k=0; k<n; k++){
                res[k][c]++;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(res[i][j]%2!=0){
                    count++;
                }
            }
        }
        
        return count;
    }
}