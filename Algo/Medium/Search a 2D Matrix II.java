class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        
        int shorterDim = Math.min(matrix.length, matrix[0].length);
        
        for(int i=0; i<shorterDim; i++){
            boolean verSearch = searchHelper(matrix, i, true, target);
            boolean horSearch = searchHelper(matrix, i, false, target);
            if(verSearch || horSearch) return true;
        }
        
        return false;
    }
    public boolean searchHelper(int[][] matrix, int start, boolean vertical, int target){
        int low = 0;
        int high = vertical ? matrix.length-1 : matrix[0].length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(vertical){
                if(matrix[mid][start]>target){
                    high=mid-1;
                }else if(matrix[mid][start]<target){
                    low = mid+1;
                }else if(matrix[mid][start]==target){
                    return true;
                }
            }else{
               if(matrix[start][mid]>target){
                   high=mid-1;
               }else if(matrix[start][mid]<target){
                   low = mid+1;
               }else if(matrix[start][mid]==target){
                   return true;
               }
            }
        }
        return false;
    }
}