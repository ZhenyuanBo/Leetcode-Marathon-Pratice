class MinStack {

    /** initialize your data structure here. */
    public List<Integer> stackList=null;
        
    public MinStack() {
        stackList = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stackList.add(x);
    }
    
    public void pop() {
        stackList.remove(stackList.size()-1);
    }
    
    public int top() {
        return stackList.get(stackList.size()-1);
    }
    
    public int getMin() {
        int minVal = Integer.MAX_VALUE;
        for(Integer i: stackList){
            if(i<minVal){
                minVal = i;
            }
        }
        
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