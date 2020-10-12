class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        //sliding window
        int sum=0, totalPoints=0;
        
        for(int i=0; i<k; i++){
            sum+=calories[i];
        }
        
        for(int i=k; i<calories.length; i++){
            if(sum<lower){
                totalPoints--;
            }else if(sum>upper){
                totalPoints++;
            }
            
            sum+=calories[i];
            sum-=calories[i-k];
        }
        
        if(sum<lower) totalPoints--;
        else if(sum>upper) totalPoints++;
        
        return totalPoints;
    }

}