class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        Map<List<Integer>, Integer> map =  new HashMap<>();
        
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(dominoes[0][0]);
        firstList.add(dominoes[0][1]);
        map.put(firstList, 0);

        for(int i=1; i<dominoes.length; i++){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(dominoes[i][0]);
            newList.add(dominoes[i][1]);
            if(map.containsKey(newList)){
                map.put(newList, map.get(newList)+1);    
            }else{
                newList.remove(0);
                newList.add(dominoes[i][0]);
                if(map.containsKey(newList)){
                    map.put(newList, map.get(newList)+1);
                }else{
                   map.put(newList, 0); 
                }
            }
        }
        
        int totalCount=0;
        
        for(Integer val: map.values()){
            for(int i=0; i<=val; i++){
                totalCount+=i;
            }
        }
        
        return totalCount;
    }
}