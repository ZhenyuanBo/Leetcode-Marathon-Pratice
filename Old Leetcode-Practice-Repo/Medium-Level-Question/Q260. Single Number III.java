class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int j=0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer i: map.keySet()){
            if(map.get(i)!=2){
                res[j] = i;
                j++;
            }
        }
        return res;
    }
}