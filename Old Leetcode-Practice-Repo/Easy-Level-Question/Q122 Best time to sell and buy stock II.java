class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0) return 0;
        
        int prevVal = prices[0];
        
        int profit = 0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prevVal){
                prevVal = prices[i];
            }else{
                profit += prices[i]-prevVal;
                prevVal = prices[i];
            }
        }
        
        return profit;
    }
}