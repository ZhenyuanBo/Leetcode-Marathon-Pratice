class Solution {
    public boolean checkRecord(String s) {
        int countA=1;
        boolean twoConL=false;
        
        for(int i=0; i<s.length();){
            if(s.charAt(i)=='A' && countA==2){
                return false;
            }else if(i+2<s.length() && s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                return false;
            }else{
                if(s.charAt(i)=='A'){
                    countA++;
                }
                i++;
            }
        }
        
        return true;
    }
}