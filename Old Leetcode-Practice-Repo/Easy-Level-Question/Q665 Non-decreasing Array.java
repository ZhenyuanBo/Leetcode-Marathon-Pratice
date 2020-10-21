class Solution {
    public boolean checkPossibility(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i+1<nums.length && nums[i]>nums[i+1]){
                int[] temp = nums;
                if(i==0){
                    temp[i] = temp[i+1];
                    if(checkPossibilityHelper(temp))
                        return true;
                    else
                        return false;
                }else{
                    int tmp = temp[i+1];
                    int tmp1 = temp[i];
                    temp[i+1] = tmp1;
                    if(checkPossibilityHelper(temp))
                        return true;
                    else{
                        temp[i] = tmp;
                        temp[i+1] = tmp;
                        if(checkPossibilityHelper(temp))
                            return true;
                        else
                            return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean checkPossibilityHelper(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
            if(i+1 < nums.length && nums[i] > nums[i+1])
                return false;
        }
        return true;
    }
}