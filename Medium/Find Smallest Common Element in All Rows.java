class Solution {
    public int smallestCommonElement(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                int count = map.getOrDefault(mat[i][j], 0) + 1;
                map.put(mat[i][j], count);
            }
        }
        
        int smallestVal = -1;
        
        for(Integer key: map.keySet()){
            if(map.get(key)==mat.length){
                smallestVal = key;
                break;
            }
        }
        
        return smallestVal;
    }
}