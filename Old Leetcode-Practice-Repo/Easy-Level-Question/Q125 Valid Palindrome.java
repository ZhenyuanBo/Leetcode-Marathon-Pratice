class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\W]", "").toLowerCase();
        Stack st = new Stack();
        
        for(char ch: s.toCharArray()){
            st.push(ch);
        }
        
        for(char ch: s.toCharArray()){
            if((char)st.pop() != ch) return false;
        }
        
        return true;
        
    }
}