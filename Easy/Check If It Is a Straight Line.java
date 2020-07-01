class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        boolean isInfiniteSlope = false;
        boolean isZeroSlope = false;
        double refSlope=0.0;
        
        double ydiffRef = coordinates[1][1] - coordinates[0][1];
        double xdiffRef = coordinates[1][0] - coordinates[0][0];
        
        if(xdiffRef==0){
            isInfiniteSlope = true;
        }else if(ydiffRef==0){
            isZeroSlope = true;
        }else{
            refSlope = ydiffRef / xdiffRef;
        }
        
        for(int i=1; i+1<coordinates.length; i++){
            double ydiff = coordinates[i+1][1] - coordinates[i][1];
            double xdiff = coordinates[i+1][0] - coordinates[i][0];
            
            if(xdiff==0){
                if(!isInfiniteSlope){
                    return false;
                }
            }else if(ydiff==0){
                if(!isZeroSlope){
                    return false;
                }
            }else{
                double curSlope = ydiff/xdiff;
                if(refSlope != curSlope) return false;
            }
        }
        
        return true;
    }
}