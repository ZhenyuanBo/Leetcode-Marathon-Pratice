class Solution {
    public int scoreOfParentheses(String S) {
        /*
        .(.(.))
        dot here represents the depth in the string
        we keep the score for each dot
        when we meet the opening bracket, the score will be set to 0
        when we meet the closing bracket, the score will be updated
        */
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        
        for(char ch: S.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }else{
                int cur = stack.pop();
                int prev = stack.pop();
                int newVal = prev + Math.max(2*cur, 1);
                stack.push(newVal);
            }
        }
        
        return stack.pop();
    }
}