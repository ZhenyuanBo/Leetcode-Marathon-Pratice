public class Solution {
    public String reverseWords(String s) {
        String[] sArray = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for(int i=sArray.length-1; i>=0; i--){
            sb.append(sArray[i]).append(" ");
        }
        
        return sb.toString().trim();
    }
}