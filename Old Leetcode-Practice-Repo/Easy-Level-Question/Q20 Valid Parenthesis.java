class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();

        for(int i=0; i<s.length();i++){
            char currChar = s.charAt(i);
            if(currChar == '{'){
            	st.push('}');
            }else if(currChar == '['){
            	st.push(']');
            }else if(currChar == '('){
            	st.push(')');
            }else{
                if(st.empty() || (char)st.pop() != currChar) return false;
            }
        }

        if(st.empty()) return true;

        return false;

    }
}