class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack();
        Stack<Integer> buffer = new Stack();
        
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)=='(' || s.charAt(i)==')') && st.isEmpty()){
                st.push(i);
            }else if(s.charAt(i)=='('){
                st.push(i);
            }else if(s.charAt(i)==')' && s.charAt(st.peek())=='('){
                st.pop();
            }else if(s.charAt(i)==')'){
                st.push(i);
            }
        }
        
        while(!st.isEmpty()){
            buffer.push(st.pop());
        }
        
        String res="";
        
        for(int i=0; i<s.length(); i++){
            if(!buffer.isEmpty() && i==buffer.peek()){
                buffer.pop();
            }else{
                res+=s.charAt(i);
            }
        }
        
        return res;
    }
}