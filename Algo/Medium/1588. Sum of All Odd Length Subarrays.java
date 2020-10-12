class Solution {
    int sum=0;
    int j=1;
    boolean needsExit=false;
    
    public int sumOddLengthSubarrays(int[] arr) {
        while(j<=arr.length){
            for(int i=0; i<arr.length; i++){
                if(i+j<=arr.length){
                    sum+=sumCalculate(arr, i, i+j);
                }
            }
            j+=2;
        }
        
        return sum;
        
    }
    private int sumCalculate(int[] arr, int s, int e){
        int sum=0;
        
        for(int i=s; i<e; i++){
            sum+=arr[i];
        }

        return sum;
    }
    
}