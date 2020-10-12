class Solution {
    public int findKthLargest(int[] nums, int k) {
        //smallest value comes first
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2)->n1-n2);
        for(int i: nums){
            pq.add(i);
            //always keeps k largest element
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.poll();
    }
}