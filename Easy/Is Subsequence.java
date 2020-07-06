class Solution {
    public boolean isSubsequence(String s, String t) {
        //dynamic programming
        int m=s.length();
        int n=t.length();
        
        boolean[][] dp = new boolean[m+1][n+1];
        
        for(int i=0; i<n+1; i++){
            dp[0][i] = true;
        }
        
        for(int r=1; r<m+1; r++){
            for(int c=0; c<n+1; c++){
                if(r>c){
                    dp[r][c] = false;
                }else{
                    if(s.charAt(r-1) == t.charAt(c-1)){
                        dp[r][c] = dp[r-1][c-1];
                    }else{
                        dp[r][c] = dp[r][c-1];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
}