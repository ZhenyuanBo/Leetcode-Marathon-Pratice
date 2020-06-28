class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0; i<arr1.length; i++){
            if(allGreaterThanD(arr1[i], arr2, d)){
                count++;
            }
        }
        return count;
    }
    private boolean allGreaterThanD(int val, int[] arr2, int d){
        for(int i=0; i<arr2.length; i++){
            if(Math.abs(val-arr2[i])<=d){
                return false;
            }
        }
        return true;
    }
}