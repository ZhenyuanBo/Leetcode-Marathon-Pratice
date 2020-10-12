class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0; i<prices.length; i++){
            int price = prices[i];
            int discount=0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]<=price){
                    discount=prices[j];
                    break;
                }
            }
            prices[i] = price-discount;
        }
        return prices;
    }
}