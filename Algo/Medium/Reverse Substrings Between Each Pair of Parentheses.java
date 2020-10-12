class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack();
        Queue<Character> buffer = new LinkedList();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }else{
                while(stack.peek()!='('){
                    buffer.add(stack.pop());
                }
                stack.pop();
                while(!buffer.isEmpty()){
                    stack.push(buffer.poll());
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                sb.insert(0, stack.pop());
            }
        }else{
            while(!buffer.isEmpty()){
                sb.append(buffer.poll());
            }
        }
        
        
        return sb.toString();
    }
}