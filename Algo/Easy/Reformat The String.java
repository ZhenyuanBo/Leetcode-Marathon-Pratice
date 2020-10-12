class Solution {
    public String reformat(String s) {
        
        if(s.length()==1) return s;
        
        String digitStr = "";
        String letterStr = "";
        
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                digitStr+=s.charAt(i);
            }else if(Character.isLetter(s.charAt(i))){
                letterStr+=s.charAt(i);
            }
        }
         
        if(digitStr.length()==0 || letterStr.length()==0) return "";
        
        String ans="";
        
        if(digitStr.length() >= letterStr.length()){
            for(int i=0; i<digitStr.length(); i++){
                ans+=digitStr.charAt(i);
                if(i<letterStr.length()) ans+=letterStr.charAt(i);
            }
        }else{
            for(int i=0; i<letterStr.length(); i++){
                ans+=letterStr.charAt(i);
                if(i<digitStr.length()) ans+=digitStr.charAt(i);
            }
        }
        
        return ans;
    }
}