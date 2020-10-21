class MyQueue {

    /** Initialize your data structure here. */
    
    private Stack<Integer> s1 = null;
    private Stack<Integer> s2 = null;
    private int front;
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
        front=0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.isEmpty() && !s2.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!s1.isEmpty()){
            while(s1.size()>1){
                s2.push(s1.pop());
            }
            front = s1.pop();
        }else if(!s2.isEmpty()){
            front = s2.pop();
        }
        return front; 
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty())
            return true;
        return false;
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