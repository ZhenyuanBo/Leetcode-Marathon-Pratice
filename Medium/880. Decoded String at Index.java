class Solution {
    public String decodeAtIndex(String S, int K) {
        
        long size=0;
        
        for(int i=0; i<S.length(); i++){
            if(Character.isDigit(S.charAt(i))){
                size *= S.charAt(i)-'0';
            }else{
                size++;
            }
        }
        
        for(int i=S.length()-1; i>=0; i--){
            K%=size;
            if(K==0 && Character.isLetter(S.charAt(i)))
                return S.charAt(i)+"";
            if(Character.isDigit(S.charAt(i))){
                size /= S.charAt(i)-'0';
            }else{
                size--;
            }
        }
        
        return null;
        

    }
}