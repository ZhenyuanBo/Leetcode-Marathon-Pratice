class Solution {
    public int minStartValue(int[] nums) {
        int startVal = Math.max(1, 1-nums[0]); 
        
        while(true){
            int val=0;
            boolean foundStartVal=true;
            for(int i=0; i<nums.length; i++){
                if(i==0){
                    val = startVal + nums[i];
                }else{
                    val += nums[i];
                }
                if(val<1){
                    startVal++;
                    foundStartVal=false;
                    break;
                }
            }
            if(foundStartVal){
                break;
            }
        }
        return startVal;
    }
}