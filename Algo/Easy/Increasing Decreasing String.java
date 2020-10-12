class Solution {
    public String sortString(String s) {
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        
        String res="";
        
        while(res.length()!=s.length()){
            char smChar=' '; 
            char lgChar=' ';
            for(int i=0; i<sarr.length; i++){
                if(sarr[i]!='\n'){
                    res+=sarr[i];
                    smChar=sarr[i];
                    sarr[i] = '\n';
                    break;
                }
            }
            for(int i=1; i<sarr.length; i++){
                if(sarr[i]>smChar && sarr[i]!='\n'){
                    res+=sarr[i];
                    smChar = sarr[i];
                    sarr[i] = '\n';
                }
            }
            for(int i=sarr.length-1; i>=0; i--){
                if(sarr[i]!='\n'){
                    res+=sarr[i];
                    lgChar = sarr[i];
                    sarr[i] = '\n';
                    break;
                }
            }
            for(int i=sarr.length-1; i>=0; i--){
                if(sarr[i]<lgChar && sarr[i]!='\n'){
                    res+=sarr[i];
                    lgChar = sarr[i];
                    sarr[i] = '\n';
                }
            }
        }
        
        return res;
        
    }
}