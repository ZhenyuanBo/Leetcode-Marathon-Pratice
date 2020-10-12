class MinStack {
    private List<Integer> data;
    private int minVal;
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
        minVal = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        data.add(x);
        minVal = Math.min(minVal, x);
    }
    
    public void pop() {
        data.remove(data.size()-1);
        minVal = Integer.MAX_VALUE;
        for(Integer i: data){
            minVal = Math.min(i, minVal);
        }
    }
    
    public int top() {
        return data.get(data.size()-1);
    }
    
    public int getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 //solution - using stack 
 class MinStack {
    // private List<List<Integer>> data;
    private Stack<int[]> stack;
    /** initialize your data structure here. */
    public MinStack() {
        // data = new ArrayList<>();
        stack = new Stack<>();
    }
    
    public void push(int x) {
        // List<Integer> pair = new ArrayList<>();
        // int lastMin=0;
        // int currMin=0;
        // if(data.size()>=1){
        //   lastMin = data.get(data.size()-1).get(1); 
        //   currMin = Math.min(lastMin, x);
        // }else{
        //   currMin = x;
        // }
        // pair.add(x);
        // pair.add(currMin);
        // data.add(pair);
        if(stack.isEmpty()){
            stack.push(new int[]{x, x});
        }else{
            int currMin = stack.peek()[1];
            stack.push(new int[]{x, Math.min(x, currMin)});
        }
    }
    
    public void pop() {
        // data.remove(data.size()-1);
        stack.pop();
    }
    
    public int top() {
        // return data.get(data.size()-1).get(0);
        return stack.peek()[0];
    }
    
    public int getMin() {
        // return data.get(data.size()-1).get(1);
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 //stack stores a pair of currVal + currMin

 //two stacks:
 class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int min = minStack.peek() < x ? minStack.peek() : x;
            minStack.push(min);
        }
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */