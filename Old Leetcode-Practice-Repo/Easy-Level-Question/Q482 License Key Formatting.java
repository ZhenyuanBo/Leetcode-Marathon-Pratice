class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        StringBuilder strRes = new StringBuilder();
        int count=0;
        
        for(int i=S.length()-1; i>=0; i--){
            if(count<K){
                if(S.charAt(i)=='-') continue;
                strRes.insert(0,S.charAt(i));
                count++;
            }else{
                if(S.charAt(i)=='-'){
                    strRes.insert(0,'-');
                    count=0;
                }else{
                    strRes.insert(0,'-').insert(0,S.charAt(i));
                    count=1;
                }
            }
        }
        
        if(strRes.length()!=0 && strRes.toString().charAt(0)=='-'){
            strRes.deleteCharAt(0);
        }
        
        return strRes.toString();
    }
}