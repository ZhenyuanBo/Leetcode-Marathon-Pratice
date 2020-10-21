class Solution {
    public String reverseWords(String s) {
        String[] strSplit = s.split("\\s+");
        StringBuilder reverseString = new StringBuilder();
        
        for(String str: strSplit){
            
            StringBuilder tempStr = new StringBuilder();
            
            for(int i=str.length()-1;i>=0;i--){
                tempStr.append(str.charAt(i));
            }
            
            tempStr.append(' ');
            reverseString.append(tempStr.toString());
        }
        
        String ans =  reverseString.toString().trim();
        
        return ans;
    }
}