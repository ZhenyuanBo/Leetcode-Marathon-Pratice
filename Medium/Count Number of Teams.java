class Solution {
    public int numTeams(int[] rating) {
       int[] leftSmallerValues = new int[rating.length];
       int[] leftBiggerValues = new int[rating.length];
       
       for(int i=0; i<rating.length; i++){
           int curr=rating[i];
           for(int j=0; j<i; j++){
               if(curr>rating[j]) leftSmallerValues[i]++;
               else
                   leftBiggerValues[i]++;
           }
       }
        
       int res=0;
        
       for(int i=2; i<rating.length; i++){
           int curr = rating[i];
           for(int j=0; j<i; j++){
               if(curr>rating[j]) res+=leftSmallerValues[j];
               else
                   res+=leftBiggerValues[j];
           }
       }
        
       return res;
    }
}