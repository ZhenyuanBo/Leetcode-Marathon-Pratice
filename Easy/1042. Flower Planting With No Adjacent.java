class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] flowerType = new int[N];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int[] path: paths){
            if(!map.containsKey(path[0])){
                List<Integer> list = new ArrayList<>();
                list.add(path[1]);
                map.put(path[0], list);
            }else{
                map.get(path[0]).add(path[1]);
            }
            
            if(!map.containsKey(path[1])){
                List<Integer> list = new ArrayList<>();
                list.add(path[0]);
                map.put(path[1], list);
            }else{
                map.get(path[1]).add(path[0]);
            }
        }
        
        for(int i=1; i<=N; i++){
            List<Integer> list = map.get(i);
            int size = list==null ? 0: list.size();
            Set<Integer> usedFlowerType = new HashSet<>();
            
            for(int j=0; j<size; j++){
                int garden = list.get(j)-1;
                if(flowerType[garden]!=0){
                    usedFlowerType.add(flowerType[garden]);
                }
            }
            
            int assignedFlowerType = nextFlowerType(usedFlowerType);
            
            flowerType[i-1] = assignedFlowerType;
        }
        
        return flowerType;
        
        
    }
    private int nextFlowerType(Set<Integer> usedFlowerType){
        for(int i=1; i<=4; i++){
            if(!usedFlowerType.contains(i)) return i;
        }
        return 1;
    }
}