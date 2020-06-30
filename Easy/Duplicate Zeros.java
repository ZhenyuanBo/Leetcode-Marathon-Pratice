class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length;){
            if(arr[i]==0){
                for(int j=arr.length-1; j>i+1; j--){
                    arr[j] = arr[j-1];
                }
                if(i+1<arr.length) arr[i+1] = 0;
                i+=2;
            }else{
                i++;
            }
        }
    }
}