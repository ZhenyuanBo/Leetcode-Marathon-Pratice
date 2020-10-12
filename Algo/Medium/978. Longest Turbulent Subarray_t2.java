class Solution {
    public int maxTurbulenceSize(int[] A) {
        if(A.length==1) return 1;
        
        int maxLen=0;
        int j=0;
        
        char prevSign=' ';
        
        for(int i=1; i<A.length; i++){
            char currSign = ' ';
            
            if(A[i-1]<A[i]){
                currSign = '<';
            }else if(A[i-1]>A[i]){
                currSign = '>';
            }else{
                currSign = '=';
            }
            
            if(currSign=='='){
                j=i;
            }else if(prevSign!=' ' && currSign==prevSign){
                while(j<i-1){
                    j++;
                }
            }
            
            maxLen = Math.max(maxLen, i-j+1);
            prevSign = currSign;
            
        }
        
        return maxLen;
    }
}