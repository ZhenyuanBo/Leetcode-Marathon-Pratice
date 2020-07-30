class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res=false;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i].length>0 && target>=matrix[i][0]){
                res = helper(matrix, i, target);
            }
        }
        return res;
    }
    private boolean helper(int[][] matrix, int r, int target){
        int left=0, right=matrix[0].length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(matrix[r][mid]>target){
                right = mid-1;
            }else if(matrix[r][mid]<target){
                left = mid+1;
            }else if(matrix[r][mid]==target){
                return true;
            }
        }
        
        return false;
    }
}