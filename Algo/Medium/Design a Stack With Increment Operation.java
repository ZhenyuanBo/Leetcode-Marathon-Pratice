class CustomStack {
    private int[] stack;
    private int numElements;
    
    public CustomStack(int maxSize) {
       stack = new int[maxSize];
        numElements=0;
    }
    
    public void push(int x) {
        if(numElements!=stack.length){
            numElements++;
            stack[numElements-1] = x;
        }
    }
    
    public int pop() {
        if(numElements<=0) return -1;
        
        int topElement = stack[numElements-1];
        numElements--;
        return topElement;
    }
    
    public void increment(int k, int val) {
        int index = numElements>k ? k : numElements;
        
        for(int i=0; i<index; i++){
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */