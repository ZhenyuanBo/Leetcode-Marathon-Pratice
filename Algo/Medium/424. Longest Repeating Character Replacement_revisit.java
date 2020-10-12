class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount=0;
        int maxLen=0;
        
        int j=0;
        
        int[] alphabetarr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            alphabetarr[s.charAt(i)-'A']++;
            maxCount = Math.max(maxCount, alphabetarr[s.charAt(i)-'A']);
            
            //this is trick!! (i-j-maxCount+1>k is the point when we need to move up j)
            while(i-j-maxCount+1>k){
                alphabetarr[s.charAt(j)-'A']--;
                j++;
            }
            
            maxLen = Math.max(maxLen, i-j+1);
        }
        
        return maxLen;
    }
}