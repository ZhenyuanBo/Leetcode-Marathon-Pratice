class Solution {

    public String shiftingLetters(String S, int[] shifts) {
        shifts[shifts.length-1]%=26;
        for(int i=shifts.length-2; i>=0; i--){
            shifts[i]+=shifts[i+1];
            shifts[i]%=26;
        }
        char[] ch = S.toCharArray();
        for(int i=0; i<ch.length; i++){
            ch[i] += shifts[i];
            if(ch[i] > 'z') ch[i]-=26;
        }
        return new String(ch);
    }
    
}