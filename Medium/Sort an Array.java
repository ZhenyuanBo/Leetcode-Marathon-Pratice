class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1) return nums;
        int pivot = nums.length/2;
        int[] leftPart = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] rightPart = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(leftPart, rightPart);
    }
    private int[] merge(int[] left, int[] right){
        int[] ret = new int[left.length + right.length];
        int leftCursor=0, rightCursor=0, retCursor=0;
        
        while(leftCursor<left.length && rightCursor<right.length){
            if(left[leftCursor]<right[rightCursor]){
                ret[retCursor] = left[leftCursor];
                leftCursor++;
            }else{
                ret[retCursor] = right[rightCursor];
                rightCursor++;
            }
            retCursor++;
        }
        
        while(leftCursor<left.length){
            ret[retCursor++] = left[leftCursor++];
        }
        
        while(rightCursor<right.length){
            ret[retCursor++] = right[rightCursor++];
        }
        
        return ret;
    }
}