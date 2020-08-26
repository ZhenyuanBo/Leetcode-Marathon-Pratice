class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                if(!st.isEmpty() && Character.isLowerCase(st.peek()) && st.peek() == Character.toLowerCase(s.charAt(i))){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                if(!st.isEmpty() && Character.isUpperCase(st.peek()) && st.peek() == Character.toUpperCase(s.charAt(i))){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.insert(0, ch);
        }
        
        return sb.toString();
    }
}