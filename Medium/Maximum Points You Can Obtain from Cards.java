class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;
        
        //reference score
        for(int i=0; i<k; i++){
            score += cardPoints[i];
        }
        
        int ans=score;
        
        int start = k-1, end = cardPoints.length-1;
        
        while(start>=0){
            score-=cardPoints[start];
            score+=cardPoints[end];
            ans = Math.max(ans, score);
            start--;
            end--;
        }
        
        return ans;
    }
}