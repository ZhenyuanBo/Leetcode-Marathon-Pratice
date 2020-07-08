class Solution {
public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        for (int i=0; i<m;i++) {
            for (int j=0;j<n;j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = mat[i][j];
                }
                else if (i == 0) {
                    dp[i][j] = dp[i][j-1] + mat[i][j];
                }
                else if (j == 0) {
                    dp[i][j] = dp[i-1][j] + mat[i][j];
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mat[i][j];
                }
            }
        }
        
        int[][] res = new int[m][n];
        for (int i=0; i<m;i++) {
            for (int j=0;j<n;j++) {
                int r1 = Math.max(0, i - k);
                int r2 = Math.min(m-1, i + k);
                int c1 = Math.max(0, j - k);
                int c2 = Math.min(n-1, j + k);

                if (r1 == 0 && c1 == 0) {
                    res[i][j] = dp[r2][c2];
                } 
                else if (r1 == 0) {
                    res[i][j] = dp[r2][c2] - dp[r2][c1-1];
                }
                else if (c1 == 0) {
                    res[i][j] = dp[r2][c2] - dp[r1-1][c2];
                }
                else {
                    res[i][j] = dp[r2][c2] - dp[r2][c1-1] - dp[r1-1][c2] + dp[r1-1][c1-1];
                }
            }
        }
        return res;
    }
}