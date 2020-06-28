class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = start+2*i;
        }
        
        int xorval=arr[0];
        
        for(int j=1; j<arr.length; j++){
            xorval ^= arr[j];
        }
        
        return xorval;
    }
}
