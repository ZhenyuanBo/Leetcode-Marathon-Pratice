class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        
        char prevChar = word.charAt(0);
        
        for(int i=1;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i)) && Character.isLowerCase(prevChar)|| 
               Character.isUpperCase(word.charAt(i)) && Character.isUpperCase(prevChar) ||
               Character.isUpperCase(prevChar) && Character.isLowerCase(word.charAt(1))){
               prevChar = word.charAt(i);
            }else {
                return false;
            }
        }
        
        return true;
    }
}