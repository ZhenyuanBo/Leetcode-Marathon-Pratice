class Solution {
    public int minimumSwap(String s1, String s2) {
        //calculate number of mismatch x-y and y-x
        //if sum of mismatch is even, then we can find value
        //if sum of mismatch is odd, then it is impossible
        if(s1.length()!=s2.length()) return -1;
        if(s1.equals(s2)) return 0;
        
        int x_y=0, y_x=0;
        
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)=='x' && s2.charAt(i)=='y') x_y++;
                else if(s1.charAt(i)=='y' && s2.charAt(i)=='x') y_x++;
            }
        }
        
        if((x_y+y_x)%2!=0) return -1;
        
        return x_y/2 + y_x/2 + (x_y%2==0 ? 0 : 2);
    }
}