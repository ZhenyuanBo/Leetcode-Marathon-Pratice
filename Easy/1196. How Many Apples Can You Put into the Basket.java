class Solution {
    public int maxNumberOfApples(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        int weight=0;
        
        for(int i=0; i<arr.length; i++){
            weight+=arr[i];
            if(weight>5000){
                break;
            }
            count++;
        }
        
        return count;
    }
}