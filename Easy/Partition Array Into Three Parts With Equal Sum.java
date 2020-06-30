class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        
        for(int i=0; i<A.length; i++){
            sum+=A[i];
        }
        
        int partitionSum=sum/3;
        int currSum=0;
        int count=3;
        
        for(int k=0; k<A.length; k++){
            currSum+=A[k];
            if(currSum == partitionSum){
                currSum=0;
                count--;
            }
        }
        
        if(count<=0){
            return true;
        }
        
        return false;
    }
}