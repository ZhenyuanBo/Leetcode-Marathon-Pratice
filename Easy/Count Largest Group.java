class Solution {
    public int countLargestGroup(int n) {
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        
        for(int i=1; i<=n; i++){
            int sumDigits = calculateSumDigits(i);
            if(map.containsKey(sumDigits)){
                List<Integer> list = map.get(sumDigits);
                list.add(i);
                map.put(sumDigits, list);
            }else{
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(sumDigits, list);
            }
        }
        
        int count=0;
        int maxSize = Integer.MIN_VALUE;
        
        for(Integer key: map.keySet()){
            maxSize = Math.max(maxSize, map.get(key).size());
        }
        
        for(Integer key: map.keySet()){
            if(map.get(key).size() == maxSize){
                count++;
            }
        }
        
        return count;
    }
    private int calculateSumDigits(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            n=n/10;
            sum+=rem;
        }
        return sum;
    }
}