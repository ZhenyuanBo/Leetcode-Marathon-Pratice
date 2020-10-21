class MyStack {

    /** Initialize your data structure here. */
    private Queue<Integer> Q1 = null;
    private Queue<Integer> Q2 = null;
    private int top;
    
    public MyStack() {
        Q1 = new LinkedList<>();
        Q2 = new LinkedList<>();
        top=0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Q1.add(x);
        top=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(Q1.size()>1){
            top = Q1.remove();
            Q2.add(top);
        }
        int lastVal = Q1.remove();
        Queue<Integer> temp = Q1;
        Q1 = Q2;
        Q2 = temp;
        return lastVal;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(Q1.size()==0)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */