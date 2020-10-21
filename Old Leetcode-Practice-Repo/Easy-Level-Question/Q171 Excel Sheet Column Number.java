class Solution {
    public int titleToNumber(String s) {
        
        int sLen = s.length();
        int i=0;
        int val=0;
        s = s.toUpperCase();
        
        while(sLen>0){
            val = val * 26;
            val = val + (int)s.charAt(i)-64;
            i++;
            sLen--;
        }
        
        return val;
    }
}