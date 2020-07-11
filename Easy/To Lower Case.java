class Solution {
    public String toLowerCase(String str) {
        String s = "";
        for(char ch: str.toCharArray()){
            int val = (int)ch;
            if(val>=65 && val<=90){
                val += 32;
                char newCh = (char)val;
                s+=newCh;
            }else{
                s+=ch;
            }
        }
        return s;
    }
}