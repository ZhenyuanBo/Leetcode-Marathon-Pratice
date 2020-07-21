class MyQueue {
    
    Stack<Integer> s;
    Stack<Integer> buffer;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack<>();
        buffer = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s.isEmpty()){
            s.push(x);
        }else{
            while(!s.isEmpty()){
                buffer.push(s.pop());
            }
            s.push(x);
            while(!buffer.isEmpty()){
                s.push(buffer.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */