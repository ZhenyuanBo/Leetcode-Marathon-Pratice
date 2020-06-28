class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> luckyNum = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            int freq = map.getOrDefault(arr[i], 0)+1;
            map.put(arr[i], freq);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) == key){
                luckyNum.add(key);
            }
        }
        if(luckyNum.size()>1){
            Collections.sort(luckyNum);
            return luckyNum.get(luckyNum.size()-1);
        }else if(luckyNum.size()==1){
            return luckyNum.get(0);
        }
        
        return -1;
    }
}