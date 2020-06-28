class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length;){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j<freq; j++){
                list.add(val);
            }
            i+=2;
        }
        
        int[] res = new int[list.size()];
        
        for(int k=0; k<res.length; k++){
            res[k] = list.get(k);
        }
        
        return res;
    }
}