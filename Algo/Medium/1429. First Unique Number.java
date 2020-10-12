class FirstUnique {
    private Queue<Integer> queue = new LinkedList<>();
    private Map<Integer, Boolean> isUnique = new HashMap<>();
    
    public FirstUnique(int[] nums) {
        for(int num: nums){
            this.add(num);
        }
    }
    
    public int showFirstUnique() {
        while(!queue.isEmpty() && !isUnique.get(queue.peek())){
            queue.remove();
        }
        if(!queue.isEmpty()) return queue.peek();
        
        return -1;
    }
    
    public void add(int value) {
        if(!isUnique.containsKey(value)){
            isUnique.put(value, true);
            queue.add(value);
        }else{
            isUnique.put(value, false);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */