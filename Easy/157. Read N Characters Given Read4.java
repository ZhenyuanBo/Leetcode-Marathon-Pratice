/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char[] buf4 = new char[4];
        int numCharRead=0, num=4;
        
        
        while(numCharRead<n && num==4){
            num = read4(buf4);
            for(int i=0; i<num; i++){
                if(numCharRead == n) return numCharRead;
                buf[numCharRead] = buf4[i];
                numCharRead++;
            }
        }
        
        return numCharRead;
    }
}