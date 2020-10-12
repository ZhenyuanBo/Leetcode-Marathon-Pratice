class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums2){
            while(!stack.isEmpty() && stack.peek()<i){
                map.put(stack.peek(), i);
                stack.pop();
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int val = stack.pop();
            map.put(val, -1);
        }
        
        int[] res = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        
        return res;
    }
}