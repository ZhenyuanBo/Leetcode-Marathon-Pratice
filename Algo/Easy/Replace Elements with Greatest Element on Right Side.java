class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i] = -1;
            }else{
                arr[i] = largestVal(arr, i+1);
            }
        }
        return arr;
    }
    private int largestVal(int[] arr, int startIndex){
        int largest = Integer.MIN_VALUE;
        for(int i=startIndex; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}