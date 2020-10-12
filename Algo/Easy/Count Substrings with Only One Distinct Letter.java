class Solution {
    public int countLetters(String S) {
        char currCh = S.charAt(0);
        int count=1;
        int res=0;
        
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i)!=currCh){
                res+=getCount(count);
                count=1;
                currCh = S.charAt(i);
            }else{
                count++;
            }
        }
        
        return res+getCount(count);
    }
    private int getCount(int count){
        if(count==1) return 1;
        
        return count + getCount(count-1);
    }
}