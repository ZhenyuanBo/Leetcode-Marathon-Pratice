public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //using n &= n-1 to remove 1 at a time
        /*
        1. if the last bit of n is 1, then n-1 removes the last bit
        2. if the last bit of n is not 1, then the first 1 from the right will be removed and the bits after that bit will be all different 
        from n-1
        */
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //sol2: n & 1: get 1 from the tail
        int count=0;
        for(int i = 0; i < 32; i++) {
			//check if the last bit is 1, if it is count is incremented one at a time
            if((int)(n&1)==1) count++;
            n>>=1;
        }
        return count;
    }
}
