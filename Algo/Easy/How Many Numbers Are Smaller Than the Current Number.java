class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] val=new int[nums.length];
        int[] originalNums = nums.clone();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count=0;
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                count++;
            }else{
                map.put(nums[i], count);
                count++;
            }
        }

        for(int i=0; i<nums.length; i++){
            val[i] = map.get(originalNums[i]);
        }
        
        return val;
    }
}

//solution 2: nested for loop O(n^2)
