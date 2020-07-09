class Solution {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        String s = "";
        int hemDis=0;
        
        while(res!=0){
            int rem = res%2;
            s+=rem;
            res /=2;
        }
        for(char ch: s.toCharArray()){
            if(ch == '1') hemDis++;
        }
        return hemDis;
    }
}