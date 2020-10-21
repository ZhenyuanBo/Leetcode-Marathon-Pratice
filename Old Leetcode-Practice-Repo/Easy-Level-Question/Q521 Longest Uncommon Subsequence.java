class Solution {
    public int findLUSlength(String a, String b) {
        
        int strLongerLen = a.length() >= b.length() ? a.length() : b.length();
        int result=0;
        
        if(strLongerLen == a.length()){
            if(a.contains(b)){
                if(a.length() == b.length()) return -1;
                else result = a.length();
            }else{
                result = a.length();
            }
        }else if(strLongerLen == b.length()){
            if(b.contains(a)){
                if(b.length() == a.length()) return -1;
                else result = b.length();
            }else{
                result = b.length();
            }
        }
        
        return result;
    }
    
}