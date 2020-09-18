class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        
        Set<Integer> set = new HashSet<>();
        
        int count=1;
        
        for(int i=0; i<arr.length; i++){
            if(i+1<arr.length && arr[i]==arr[i+1]){
                count++;
            }else{
                if(!set.add(count)) return false;
                count=1;
            }
        }
        
        return true;
    }
}