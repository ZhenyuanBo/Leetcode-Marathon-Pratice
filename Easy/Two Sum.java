class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     res[0] = i;
//                     res[1] = j;
//                     break;
//                 }
//             }
//         }
        
//         return res;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i], i);
            }else{
                res[1] = i;
                res[0] = map.get(target-nums[i]);
                break;
            }
        }
        
        return res;
    }
}