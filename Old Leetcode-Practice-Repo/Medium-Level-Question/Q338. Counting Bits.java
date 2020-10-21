class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        int i=0, j=0;
        while(i<=num){
            res[j++] = helper(i++);
        }
        return res;
    }
    private int helper(int val){
        int counter=0;
        while(val!=0){
            int remainder = val % 2;
            if(remainder == 1) counter++;
            val = val/2;
        }
        return counter;
    }
}