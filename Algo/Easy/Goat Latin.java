class Solution {
    public String toGoatLatin(String S) {
        String vowelStr = "aeiouAEIOU";
        String[] sArr = S.split("\\s+");
        
        String res="";
        
        for(int i=0; i<sArr.length; i++){
            String str = sArr[i];
            char firstCh = str.charAt(0);
            if(vowelStr.indexOf(firstCh)>-1){
                str += "ma";
            }else{
                str += firstCh;
                str = str.substring(1);
                str += "ma";
            }
            for(int j=0; j<i+1; j++){
                str+="a";
            }
            res+=str+" ";
        }
        
        return res.trim();
    }
}