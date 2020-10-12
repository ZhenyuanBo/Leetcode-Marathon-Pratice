class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        if(arr.length==0) return arr;
        
        int[] arrcopy = arr.clone();
        
        Arrays.sort(arr);
        
        int rank=1;
        int[] rankList = new int[arr.length];
        rankList[0] = rank;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                rankList[i] = rankList[i-1];
            }else{
                rankList[i] = ++rank;
            }
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], rankList[i]);
        }
        
        for(int i=0; i<arrcopy.length; i++){
            arrcopy[i] = map.get(arrcopy[i]);
        }
        
        return arrcopy;
    }
}