class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> valueList = new ArrayList<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        
        for(int i=0; i<mat.length; i++){
            map.put(i, numSolders(mat[i]));
        }
        
        for(Integer value: map.values()){
            valueList.add(value);
        }
        
        Collections.sort(valueList);
        
        for(Integer val: valueList){
            for(Integer key: map.keySet()){
                if(map.get(key)==val && !resList.contains(key)){
                    resList.add(key);
                    break;
                }
            }
        }
        
        int[] res = new int[k];
        
        for(int i=0; i<k; i++){
            res[i] = resList.get(i);
        }
        
        return res;

    }
    private int numSolders(int[] row){
        int count=0;
        for(int i=0; i<row.length; i++){
            if(row[i]==1){
                count++;
            }
        }
        return count;
    }
}