class Solution {
    public int numWays(int n, int k) {
        if(n==0 || k==0) return 0;
        if(n==1) return k;
        
        int[] dp = new int[n+1];
        dp[1] = k;
        int same=0;
        int diff=k;
        
        for(int i=2; i<=n; i++){
            same = diff * 1;
            diff = dp[i-1]*(k-1);
            dp[i] = same + diff;
        }
        
        return dp[n];
    }
}