class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charray = new char[s.length()];
        
        for(int i=0; i<indices.length; i++){
            int index = indices[i];
            char ch = s.charAt(i);
            charray[index] = ch;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch: charray){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}