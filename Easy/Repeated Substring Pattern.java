class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=len/2; i>0; i--){
            if(len%i==0){
                if(isValidRepeatedString(s, s.substring(0, i), len/i)) return true;
            }
        }
        return false;
    }
    private boolean isValidRepeatedString(String s, String substr, int freq){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<freq; i++){
            sb.append(substr);
        }
        return sb.toString().equals(s);
    }
}