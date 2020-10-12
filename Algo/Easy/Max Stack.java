class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    
    /** initialize your data structure here. */
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(maxStack.isEmpty()){
            maxStack.push(x);
        }else{
            int max = maxStack.peek();
            maxStack.push(max>x?max:x);
        }
    }
    
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return maxStack.peek();
    }
    
    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack();
        while(top()!=max){
            buffer.push(pop());
        }
        //find the max value
        pop();
        while(!buffer.isEmpty()){
            push(buffer.pop());
        }
        return max;
        
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */