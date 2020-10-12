class MovingAverage {
    
    private int windowSize=0;
    private double sum=0.0;
    private Queue<Integer> queue;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        windowSize=size;
    }
    
    public double next(int val) {
       queue.offer(val);
       if(queue.size()<=windowSize){
           sum+=(double)val;
           return sum/queue.size();
       }
       queue.poll();
       sum=0.0;
       Iterator<Integer> value = queue.iterator();
       while(value.hasNext()){
           sum=sum+value.next();
       }
       return sum/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */