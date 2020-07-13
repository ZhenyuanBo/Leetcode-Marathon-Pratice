class Solution {
    public int maxPower(String s) {
        int maxLen = Integer.MIN_VALUE;
        int j=0;
        int count=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(j)){
                maxLen = Math.max(++count, maxLen);
            }else{
                j=i;
                count=1;
            }
        }
        return maxLen==Integer.MIN_VALUE ? 1 : maxLen;
    }
}