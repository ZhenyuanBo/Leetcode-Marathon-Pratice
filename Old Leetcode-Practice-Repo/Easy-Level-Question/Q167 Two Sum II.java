class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int high = numbers.length-1;
        while(numbers[lo] + numbers[high] != target){
            if(numbers[lo]+numbers[high]<target){
                lo++;
            }else{
                high--;
            }
        }
        
        int[]ans = new int[2];
        ans[0] = lo+1;
        ans[1] = high+1;
        
        return ans;
    }
}