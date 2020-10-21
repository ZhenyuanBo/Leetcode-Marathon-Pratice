class Solution {
    public String longestPalindrome(String s) {
        int currLength=0;
        String res="";
        
        for(int i=0; i<s.length();i++){
            if(isPalindrome(s, i-currLength-1, i)){
                res = s.substring(i-currLength-1, i+1);
                currLength+=2;
            }else if(isPalindrome(s, i-currLength, i)){
                res = s.substring(i-currLength,i+1);
                currLength+=1;
            }
        }
        
        return res;
    }
    private boolean isPalindrome(String s, int start, int end){
        if(start<0) return false;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}