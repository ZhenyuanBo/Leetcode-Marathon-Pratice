class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime=0;
        
        for(int i=1; i<points.length; i++){
            int xdiff = Math.abs(points[i-1][0]-points[i][0]);
            int ydiff = Math.abs(points[i-1][1]-points[i][1]);
            minTime += Math.max(xdiff, ydiff);
        }
        
        return minTime;
    }
}