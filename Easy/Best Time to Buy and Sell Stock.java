class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0; i<prices.length;i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
                }
            }
        }
        if(maxProfit == Integer.MIN_VALUE) return 0;
        
        return maxProfit;
    }
}

//solution:
//find the minimum value 
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;
        int profit = 0;
        int minValue = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minValue) minValue = prices[i];
            else profit = Math.max(profit, prices[i] - minValue);
        }
        return profit;
    }
}