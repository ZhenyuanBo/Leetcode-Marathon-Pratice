class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        
        int maxProfit=0;
        int minVal = prices[0];
        for(int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minVal);
            //prices[i] - global min val
            if(prices[i]<minVal){
                minVal = prices[i];
            }
        }
        return maxProfit;
    }
}