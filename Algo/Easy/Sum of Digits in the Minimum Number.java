class Solution {
    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        int minVal = A[0];
        int sum=0;
        
        while(minVal!=0){
            int remainder = minVal%10;
            minVal = minVal/10;
            sum+=remainder;
        }
        
        if(sum%2==0) return 1;
        
        return 0;
    }
}