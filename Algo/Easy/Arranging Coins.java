class Solution {
    public int arrangeCoins(int n) {
        int step=1;
        int currStep=0;
        
        while(true){
            if(n-step < 0){
               break;
            }else{
                currStep = step;
                n-=currStep;
                step++;
            }
        }
        
        return --step;
    }
}