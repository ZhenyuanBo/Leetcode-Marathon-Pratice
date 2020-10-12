class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<Integer>();
        
        queue.add(start);
        seen.add(start);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int index = queue.poll();
            if(arr[index]==0) return true;
            //check nei index
            if(arr[index] + index < arr.length &&!seen.contains(arr[index]+index))
            {
                queue.add(arr[index]+index);
                seen.add(arr[index]+index);
            }
            if(index-arr[index]>=0 && !seen.contains(index-arr[index])){
                queue.add(index-arr[index]);
                seen.add(index-arr[index]);
            }
        }
        
        return false;
    }
}