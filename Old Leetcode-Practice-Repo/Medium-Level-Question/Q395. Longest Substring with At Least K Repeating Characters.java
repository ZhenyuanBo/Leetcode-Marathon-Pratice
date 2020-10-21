public class Solution {
    private int maxLen=0;
    
    public int longestSubstring(String s, int k) {
        for(int numUniqueTarget=1; numUniqueTarget<26; numUniqueTarget++){
            maxLen = Math.max(maxLen, helper(s, numUniqueTarget, k));
        }
        return maxLen;
    }
    private int helper(String s, int numUniqueTarget, int k){
        int[] map = new int[128];
        //initialize counter, begin, end
        int numUnique=0;
        int greaterOrEqualK = 0;
        int begin=0;
        int end=0;
        
        while(end<s.length()){
            if(map[s.charAt(end)]++ ==0) numUnique++;
            if(map[s.charAt(end++)] ==k) greaterOrEqualK++;
            while(numUnique>numUniqueTarget){
                if(map[s.charAt(begin)]-- == k) greaterOrEqualK--;
                //sliding window; window moves to the right
                if(map[s.charAt(begin++)] == 0) numUnique--;
            }
            if(numUnique == numUniqueTarget && numUnique == greaterOrEqualK){
                maxLen = Math.max(maxLen, end-begin);
            }
        }
        return maxLen;
    }
    
}