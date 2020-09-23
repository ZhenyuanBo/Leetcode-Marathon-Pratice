class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        
        while(numBottles>=numExchange){
            int remain = numBottles / numExchange;
            res += remain;
            int emptyBottles = numBottles - remain * numExchange;
            numBottles = remain + emptyBottles;
        }
        
        return res;
    }
}