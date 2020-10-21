class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int prev = nums[0];
        System.out.println(prev);
        int j=0;
        
        for(int i=1; i<nums.length;){
            int curr = nums[i];
            if(curr != prev) break;
            else if(j+2<nums.length && curr==prev){
                prev = nums[j+2];
            }
            i+=2;
            j+=2;
        }
        
        return prev;
        
    }
}