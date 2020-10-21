class Solution {
    public int countBinarySubstrings(String s) {
        if(s==null || s.length()==0) return 0;
        
        int preRun=0;
        int currRun=1;
        int count=0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)) currRun++;
            else{
                preRun = currRun;
                currRun=1;
            }
            if(preRun>=currRun) count++;
        }
        
        return count;
    }
}