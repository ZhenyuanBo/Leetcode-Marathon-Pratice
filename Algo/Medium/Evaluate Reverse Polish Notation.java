class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack();
        String op = "+-*/";
        
        for(String str: tokens){
            if(op.indexOf(str)>-1){
                int val1 = stack.pop();
                int val2 = stack.pop();
                int newVal=0;
                if(str.equals("+")){
                    newVal = val2+val1;
                }else if(str.equals("-")){
                    newVal = val2-val1;
                }else if(str.equals("*")){
                    newVal = val2*val1;
                }else if(str.equals("/")){
                    newVal = val2/val1;
                }
                stack.push(newVal);
            }else{
                stack.push(Integer.parseInt(str));
                
            }
        }
        
        return stack.pop();
    }
}