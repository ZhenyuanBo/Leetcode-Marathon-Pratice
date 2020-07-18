class Solution {
    public String removeOuterParentheses(String S) {
        String res="";
        Stack<Character> stack = new Stack();
        
        for(char ch: S.toCharArray()){
            if(ch=='(' && stack.size()==0){
                stack.push(ch);
            }else if(ch=='(' && stack.size()>0){
                res+=ch;
                stack.push(ch);
            }else if(ch==')' && stack.size()>1){
                char newCh = ch;
                while(newCh!='('){
                    res+=ch;
                    newCh = stack.pop();
                }
            }else if(ch==')' && stack.size()==1){
                stack.pop();
            }
        }
        
        return res;
    }
}