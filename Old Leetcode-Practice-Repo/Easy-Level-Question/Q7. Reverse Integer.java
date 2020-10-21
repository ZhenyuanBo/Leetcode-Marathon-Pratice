class Solution {
    
    public int reverse(int x) {
        
        String str ="";
        long val = (long) x;
        
        str = val>=0 ? reverseHelper(x, str) : '-' + reverseHelper(-val, str);
        
        Long res = Long.parseLong(str);
        
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        
        return Integer.parseInt(str);
    }
    
    private String reverseHelper(long x, String str){
        
        if(x == 0) return "0";
        
        while(x!=0){
            long remainder = x%10;
            str += remainder;
            x = x / 10;
        }
        
        return str;
    }
    
}