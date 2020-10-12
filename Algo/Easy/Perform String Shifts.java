class Solution {
    public String stringShift(String s, int[][] shift) {
        char[] sArr = new char[s.length()];
        
        for(int i=0; i<shift.length; i++){
            int direction=shift[i][0];
            int amount = shift[i][1];
            
            for(int j=0; j<s.length(); j++){
                int newIndex=0;
                if(direction==0){
                    newIndex = j+(-1)*amount;
                    if(newIndex<0){
                        newIndex = s.length()+newIndex;
                    }
                }else if(direction==1){
                    newIndex = j+amount;
                    if(newIndex>=s.length()){
                        newIndex = newIndex - s.length();
                    }
                }
                
                char ch = s.toCharArray()[j];
                sArr[newIndex] = ch;
            }
            
            s= new String();
            for(char ch: sArr){
                s+=ch;
            }
        }
        
        return s;
    }
}