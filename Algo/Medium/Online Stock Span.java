class StockSpanner {
    Stack<Integer> stack, weight;
    
    public StockSpanner() {
        stack = new Stack();
        weight = new Stack();
    }
    
    public int next(int price) {
        int w=1;
        while(!stack.isEmpty() && stack.peek()<=price){
            stack.pop();
            w+=weight.pop();
        }
        stack.push(price);
        weight.push(w);
        return weight.peek();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */