class Solution {
    public String reverseString(String s) {
        StringBuilder reverseStrBuilder = new StringBuilder();
        
        for(int i=s.length()-1; i>=0; i--){
            reverseStrBuilder.append(s.charAt(i));
        }
        
        return reverseStrBuilder.toString();
    }
}