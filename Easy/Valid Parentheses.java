class Solution {
    public boolean isValid(String s) {
        if(s.equals("")) return true;
        
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                char topItem = stack.peek();
                if(topItem=='(' && s.charAt(i)==')' || topItem=='{' && s.charAt(i)=='}' || 
                    topItem=='[' && s.charAt(i)==']'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        
        return stack.size()==0;
    }
}