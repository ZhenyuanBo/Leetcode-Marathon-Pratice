class Solution {
    public int maxTurbulenceSize(int[] A) {
        int left=0, right;
        int maxLen = Integer.MIN_VALUE;
        for(right=1; right<A.length; right++){
            int diff=Integer.compare(A[right-1], A[right]);
            if(diff==0){
                left = right;
            }else if(right==A.length-1 || diff*Integer.compare(A[right], A[right+1])!=-1){
                maxLen = Math.max(maxLen, right-left+1);
                left=right;
            }
        }
        return maxLen==Integer.MIN_VALUE ? 1: maxLen;
    }
}