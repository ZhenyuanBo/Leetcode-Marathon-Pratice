class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<T.length; i++){
            while(!stack.isEmpty() && T[i]>T[stack.peek()]){
                map.put(stack.peek(), i);
                stack.pop();
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            map.put(stack.peek(), -1);
            stack.pop();
        }
        
        int[] res = new int[T.length];
        
        for(Integer index: map.keySet()){
            if(map.get(index)==-1){
                res[index] = 0;
            }else res[index] = map.get(index)-index;
        }
        
        return res;
    }
}

//second solution:
class Solution {
    public int[] dailyTemperatures(int[] T) {
        //stack of indices
        Stack<Integer> temp = new Stack();
        int[] ans = new int[T.length];
        
        for(int i=T.length-1; i>=0; i--){
            while(!temp.isEmpty() && T[i]>=T[temp.peek()]) temp.pop();
            ans[i] = temp.isEmpty() ? 0 : temp.peek()-i;
            temp.push(i);
        }
        
        return ans;
    }
}