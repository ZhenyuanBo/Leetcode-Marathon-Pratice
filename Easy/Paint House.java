class Solution {
    public int minCost(int[][] costs) {
        //shortest-path algorithm
        if(costs==null || costs.length==0) return 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<costs[0].length; i++){
            min = Math.min(min, minCostCalculate(costs, map, 0, i));
        }
        return min;
    }
    private int minCostCalculate(int[][] costs, Map<String, Integer> map, int houseIndex, int colorIndex){
        
        if(houseIndex>=costs.length) return 0;
        if(colorIndex>=costs[0].length) return 0;
        
        String key = houseIndex + "|" + colorIndex;
        
        if(map.containsKey(key)) return map.get(key);
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<costs[0].length; i++){
            if(i==colorIndex) continue;
            min = Math.min(min, minCostCalculate(costs, map, houseIndex+1, i));
        }
        
        map.put(key, costs[houseIndex][colorIndex] + min);
        return map.get(key);
    }
}