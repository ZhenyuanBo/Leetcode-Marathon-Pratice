class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //similar to gcd 
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        
        if(str2.length()==0) return str1;
        
        String remainStr="";
        
        if(str1.startsWith(str2)){
            int remainLoc = str1.indexOf(str2) + str2.length();
            remainStr = str1.substring(remainLoc);
        }else{
            return "";
        }
        
        return gcdOfStrings(str2, remainStr);
    }
}