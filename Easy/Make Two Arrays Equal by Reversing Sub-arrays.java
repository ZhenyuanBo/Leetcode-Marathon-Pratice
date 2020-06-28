class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<target.length; i++){
            int count = map.getOrDefault(target[i], 0)+1;
            map.put(target[i], count);
        }
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                return false;
            }else{
                map.put(arr[i], map.get(arr[i])-1);
            }
        }
        
        for(Integer i: map.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}