class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[][]pair = new int[nums.length][2];
        
        for(int i=0; i<nums.length; i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        
        //generate the relative position of elements in the array
        Arrays.sort(pair, (a,b)->(b[0]-a[0]));
        
        String[] ans = new String[nums.length];
        
        int rank=1;
        for(int i=0; i<nums.length;i++){
            if(i==0){
                ans[pair[i][1]] = "Gold Medal";
            }else if(i==1){
                ans[pair[i][1]] = "Silver Medal";
            }else if(i==2){
                ans[pair[i][1]] = "Bronze Medal";
            }else{
                ans[pair[i][1]] = Integer.toString(rank);
            }
            
            rank++;
        }
        
        return ans;
    }
}