public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        /*
        32 bit int
        rev is actually 0000 0000 0000 0000 0000 0000 0000 0000
        In this sense, the loop has to interate over for 32 times
        */
        int rev=0;
        for(int i=0; i<32; i++){
            //leave out a space for incoming bit
            rev<<=1;
            if((int)(n&1)==1){
                rev^=1;
            }
            n>>=1;
        }
        return rev;
    }
}