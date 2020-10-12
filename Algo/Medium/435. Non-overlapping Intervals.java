class Solution {
    class myComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[1] - b[1];
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0) return 0;
        
        Arrays.sort(intervals, new myComparator());
        
        List<Integer> list = new ArrayList<>();
        
        //use dp to store number of valid intervals
        int[] dp = new int[intervals.length];
        dp[0] = 1;
        int ans = 1;
        
        for(int i=1; i<dp.length; i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(!isOverlapping(intervals[j], intervals[i])){
                    max = Math.max(dp[j], max);
                }
            }
            dp[i] = max+1;
            ans = Math.max(ans, dp[i]);
        }
        
        return intervals.length-ans;
    }
    private boolean isOverlapping(int[] i, int[] j){
        return i[1] > j[0];
    }
    
}