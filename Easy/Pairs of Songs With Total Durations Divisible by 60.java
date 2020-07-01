class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[]  map = new int[61];
        int count=0;
        
        for(int i=0; i<time.length; i++){
            int r = time[i]%60;
            int key = 60 - r;
            count += map[key%60];
            map[r]++;
        }
        return count;
    }
}