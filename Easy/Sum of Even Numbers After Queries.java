class Solution {
    
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];
        int initialSum=0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                initialSum+=A[i];
            }
        }
        
        for(int i=0; i<queries.length; i++){
            int index = queries[i][1];
            int val = queries[i][0];
            
            if(A[index]%2==0){
                //update sum
                initialSum-=A[index];
                A[index]+=val;
                if(A[index]%2==0) initialSum += A[index];
                res[i] = initialSum;
            }else{
                A[index]+=val;
                if(A[index]%2==0) initialSum += A[index];
                res[i] = initialSum;
            }
        }
        return res;
    }
    
}