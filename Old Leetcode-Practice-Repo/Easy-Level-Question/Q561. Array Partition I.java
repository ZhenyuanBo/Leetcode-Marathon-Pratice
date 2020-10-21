class Solution {
    public int arrayPairSum(int[] nums) {
        
        List<Integer> numList = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
        	numList.add(nums[i]);
        }

        Collections.sort(numList);

        /*
        Arrays.sort(nums);
        */
        int largeSum=0;

        for(int i=0; i<numList.size();){
        	largeSum += numList.get(i);
        	i+=2;
        }

        return largeSum;
    }
}