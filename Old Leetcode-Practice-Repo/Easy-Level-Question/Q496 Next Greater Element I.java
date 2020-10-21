class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

    	int[][] newMatrix = new int[r][c];

    	if(nums == null) return newMatrix;

    	int numsArraySize = nums.length * nums[0].length;

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