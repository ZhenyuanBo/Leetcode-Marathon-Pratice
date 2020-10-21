class Solution {
    public boolean judgeSquareSum(int c) {
        
        for(int a=0; a<=Math.sqrt(c); a++){
            int b = (int)(Math.sqrt(c-a*a));
            if(b*b==(c-a*a))
                return true;
        }
        return false;
    }
}