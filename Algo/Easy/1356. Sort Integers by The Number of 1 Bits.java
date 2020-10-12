class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for(int i=0; i<arr.length; i++){
            int num = numOnes(arr[i]);
            if(map.containsKey(num)){
                map.get(num).add(arr[i]);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(num, list);
            }
        }
        
        List<Integer> resList = new ArrayList<>();
        
        for(List<Integer> list: map.values()){
            Collections.sort(list);
            for(Integer i: list){
                resList.add(i);
            }
        }
        
        int[] res = new int[resList.size()];
        
        for(int i=0; i<resList.size(); i++){
            res[i] = resList.get(i);
        }
        
        return res;
        
    }
    private int numOnes(int n){
        int count=0;
        while(n!=0){
            int remainder = n%2;
            if(remainder==1) count++;
            n/=2;
        }
        return count;
    }
}