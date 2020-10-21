class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

    	int[][] newMatrix = new int[r][c];
        int numsArraySize = nums.length * nums[0].length;
        
    	if(nums == null) return newMatrix;
        
        if(r*c > numsArraySize) return nums;


    	int[] allNumsArray = new int[numsArraySize];

    	int k=0;

    	for(int i=0; i<nums.length; i++){
    		for(int j=0; j<nums[0].length; j++){
    			allNumsArray[k] = nums[i][j];
    			k++;
    		}
    	}
        
    	k=0;

    	for(int i=0; i<r; i++){
    		for(int j=0; j<c; j++){
    			newMatrix[i][j] = allNumsArray[k];
    			k++;
    		}
    	}

    	return newMatrix;

    }
}