class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack();
        
        for(int i=0; i<S.length(); i++){
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        
        return sb.toString();
        
    }
}