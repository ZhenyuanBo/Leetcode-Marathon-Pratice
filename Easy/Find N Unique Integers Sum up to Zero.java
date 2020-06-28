class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int startVal=1;
        
        for(int i=0; i<n;){
           if(i==n-1){
               res[i]=0;
           }else{
               res[i] = startVal;
               res[i+1] = -startVal;
               startVal++; 
           }
           i+=2;
        }
        
        return res;
    }
}