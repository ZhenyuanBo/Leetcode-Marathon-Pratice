class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[][] numsWithIndex = new int[nums.length][2];
        
        for(int i=0; i<numsWithIndex.length; i++){
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i;
        }
        
        //sort 2d array with relative posiiton of each element
        
        Arrays.sort(numsWithIndex, (a,b)->(a[0]-b[0])); 
        
        int left=0, right=nums.length-1;
        int[] ans = new int[2];
        
        while(left<right){
            if(numsWithIndex[left][0] + numsWithIndex[right][0] > target){
                right--;
            }else if(numsWithIndex[left][0] + numsWithIndex[right][0] < target){
                left++;
            }else{
                ans[0] = numsWithIndex[left][1];
                ans[1] = numsWithIndex[right][1];
                break;
            }
        }
        
        return ans;
    }
}