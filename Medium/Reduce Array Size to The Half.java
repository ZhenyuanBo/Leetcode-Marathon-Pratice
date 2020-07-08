class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            int freq = map.getOrDefault(arr[i], 0)+1;
            map.put(arr[i], freq);
        }
        LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        
        List<Integer> res = new ArrayList<Integer>();
        
        int numRemove=0;
        
        for(Integer key: reverseSortedMap.keySet()){
            if(numRemove>=arr.length/2) break;
            else{
                numRemove += reverseSortedMap.get(key);
                res.add(key);
            }
        }
        
        return res.size();
        
        
    }
}
//solution using priorityqueue
class Solution {
    public int minSetSize(int[] arr) {
        if (arr.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        PriorityQueue <Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int m : map.values()) {
            pq.add(m);
        }
        int res = 0;
        int curLen = 0;
        while(pq.size() > 0 && curLen < arr.length/2) {
            curLen += pq.poll();
            res += 1;
        }
        return res;
    }
}