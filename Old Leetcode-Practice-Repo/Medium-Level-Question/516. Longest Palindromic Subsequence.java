class Solution {
    public int longestPalindromeSubseq(String s) {
        /* every single character is a palindrome
        dp[i][j]=1;
        if s[i] = s[j], dp[i][j] = dp[i+1][j-1]+2;
        else if s[i]!=s[j] Math.max(dp[i+1][j], dp[i][j-1])
        dp[i][j] == cover the string portion from index i to index j
        dp[i][j] -- stores the value saved for substring(i,j)
        */
        int[][] dp = new int[s.length()][s.length()];
        
        for(int i=s.length()-1; i>=0; i--){
            dp[i][i]=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[0][s.length()-1];
    }
}