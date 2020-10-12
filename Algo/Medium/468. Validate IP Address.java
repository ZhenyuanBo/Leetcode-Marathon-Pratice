class Solution {
    public String validIPAddress(String IP) {
        String res = "";
        if(IP.indexOf(".")>-1){
            if(isIPv4(IP)){
                res = "IPv4";
            }
        }else if(IP.indexOf(":")>-1){
            if(isIPv6(IP)){
                res = "IPv6";
            }
        }
        
        return res=="" ? "Neither" : res;
    }
    private boolean isIPv4(String IP){
        
        String[] strArr = IP.split("\\.");
        
        if(strArr.length!=4 || IP.charAt(IP.length()-1)=='.') return false;

        for(String str: strArr){
            if(str.length()==0 || str.charAt(0)=='0' && str.length()>1 || str.length()>3) return false;
            for(char ch: str.toCharArray()){
                if(!Character.isDigit(ch)) return false;
            }
            Integer val = Integer.valueOf(str);
            if(val<0 || val>255) return false;
        }
        
        return true;
    }
    private boolean isIPv6(String IP){

        String[] strArr = IP.split(":");
        
        if(strArr.length!=8 || IP.charAt(IP.length()-1)==':') return false;
        
        for(String str: strArr){
            if(str.length()>4 || str.length()<1) return false;
            for(char ch: str.toCharArray()){
                if(!Character.isDigit(ch) && !Character.isLetter(ch)) return false;
                if(Character.getNumericValue(ch)>Character.getNumericValue('f') || Character.getNumericValue(ch)>Character.getNumericValue('F')) return false;
            }
        }
        
        return true;
    }
}