class Solution {
    public boolean isValid(String S) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='c'){
                if(!st.isEmpty() && st.peek() == 'b') st.pop();
                else return false;
                if(!st.isEmpty() && st.peek() == 'a') st.pop();
                else return false;
            }else{
                st.push(S.charAt(i));
            }
        }
        
        if(st.isEmpty()) return true;
        
        return false;
    }
}