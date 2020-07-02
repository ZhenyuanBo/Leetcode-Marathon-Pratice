class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                int smallerVal = arr[i]/2;
                if(map.containsKey(smallerVal)){
                    int index = map.get(smallerVal);
                    if(index!=i) return true;
                }
            }
        }
        
        return false;
    }
}