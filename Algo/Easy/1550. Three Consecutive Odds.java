class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean exists = false;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                if(i+1<arr.length && arr[i+1]%2!=0){
                    if(i+2<arr.length && arr[i+2]%2!=0){
                        exists = true;
                        break;
                    }
                }
            }
        }
        
        return exists;
    }
}