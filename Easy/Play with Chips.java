class Solution {
    public int minCostToMoveChips(int[] chips) {
        //calculate number of odd and even
        int numEven=0;
        int numOdd=0;
        
        for(int i: chips){
            if(i%2==0) numEven++;
            else if(i%2!=0) numOdd++;
        }
        
        return Math.min(numEven, numOdd);
    }
}