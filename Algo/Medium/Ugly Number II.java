class Solution {
    public int nthUglyNumber(int n) {
        //precompute 1690 ugly numbers
        
        int[] uglyNums = new int[1690];
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        Set<Long> seen = new HashSet<Long>();
        pq.add(1L);
        seen.add(1L);
        
        int[] primes = new int[]{2, 3, 5};
        
        
        for(int i=0; i<1690; i++){
            long uglyNum = pq.poll();
            uglyNums[i] = (int)uglyNum;
            for(int prime: primes){
                long newUglyNum = uglyNum * prime;
                if(!seen.contains(newUglyNum)){
                    seen.add(newUglyNum);
                    pq.add(newUglyNum);
                }
            }
        }
        
        return uglyNums[n-1];
    }
}