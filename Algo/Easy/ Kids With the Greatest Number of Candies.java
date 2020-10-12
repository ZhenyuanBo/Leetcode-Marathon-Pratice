class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++){
            int newCandies = candies[i]+extraCandies;
            if(isLargestVal(candies, i, newCandies)){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
    private boolean isLargestVal(int[] candies, int i, int newCandies){
        for(int j=0; j<candies.length; j++){
            if(j!=i){
                if(candies[j]>newCandies){
                    return false;
                }
            }
        }
        return true;
    }
}