class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int originalR = nums.length;
        int originalC = nums[0].length;
        
        if(originalR * originalC != r*c){
            return nums;
        }
        
        int[] numList = new int[originalR*originalC];
        
        int k=0;
        
        for(int i=0; i<originalR; i++){
            for(int j=0; j<originalC; j++){
                numList[k] = nums[i][j];
                k++;
            }
        }
        
        int[][] res = new int[r][c];
        k=0;
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                res[i][j] = numList[k];
                k++;
            }
        }
        
        return res;
    }
}