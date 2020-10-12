class Solution {
    public int findSpecialInteger(int[] arr) {
        int freq = arr.length/4;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i: arr){
            int count = map.getOrDefault(i, 0)+1;
            map.put(i, count);
        }
        
        int res=0;
        
        for(Integer key: map.keySet()){
            if(map.get(key) > freq){
               res = key;
               break;
            }
        }
        
        return res;
    }
    
}

//solution:
class Solution {
    public int findSpecialInteger(int[] arr) {
        // have a counter that when it reaches the length of arr divded by 4, it returns that number in the array
        int track = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i ++) {
            if (track == arr[i]) {
                count++;
                if (count >= arr.length / 4) {
                    return track;
                }
            } else {
                track = arr[i];
                count = 0;
            }
        }
        return track;
    }
}