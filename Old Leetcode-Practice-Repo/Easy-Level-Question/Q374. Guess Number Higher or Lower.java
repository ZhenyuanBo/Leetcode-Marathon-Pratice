/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int left=0, right=n;
        int ans=0;
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(guess(mid)==-1){
                right=mid-1;
            }else if(guess(mid)==1){
                left=mid+1;
            }else if(guess(mid)==0){
                ans=mid;
                break;
            }
            
        }
        
        return ans;
    }
}