class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int gMax = arrays.get(0).get(0);
        int gMin = arrays.get(0).get(arrays.get(0).size()-1);
        int diff = Integer.MIN_VALUE;
        
        for(int i=1; i<arrays.size(); i++){
            int currMax = arrays.get(i).get(arrays.get(i).size()-1);
            int currMin = arrays.get(i).get(0);
            
            diff = Math.max(diff, Math.abs(gMax-currMin));
            diff = Math.max(diff, Math.abs(currMax-gMin));
            
            gMax = Math.max(gMax, currMax);
            gMin = Math.max(gMin, currMin);
        }
        
        return diff;
    }
}