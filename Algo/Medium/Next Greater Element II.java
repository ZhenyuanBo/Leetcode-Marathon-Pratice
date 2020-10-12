class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        Stack<Integer> s = new Stack();
        
        for(int i=0; i<nums.length*2; i++){
            while(!s.isEmpty() && s.peek()<nums[i%nums.length]){
                if(map.containsKey(s.peek())){
                    map.get(s.peek()).add(nums[i%nums.length]);
                }else{
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(nums[i%nums.length]);
                    map.put(s.peek(), list);
                }
                s.pop();
            }
            s.push(nums[i%nums.length]);
        }
        
        while(!s.isEmpty()){
            if(map.containsKey(s.peek())){
                map.get(s.peek()).add(-1);
            }else{
                LinkedList<Integer> list = new LinkedList<>();
                list.add(-1);
                map.put(s.peek(), list);
            }
            s.pop();
        }
        
        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
           res[i] = map.get(nums[i]).poll(); 
        }
        
        return res;
        
    }
}