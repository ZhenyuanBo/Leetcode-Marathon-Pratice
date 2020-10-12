class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        LinkedList<Integer> subset = new LinkedList<>();
        for(int i=0; i<=nums.length; i++){
           backTrack(0, subset, i, nums); 
        }
        return res;
    }
    private void backTrack(int currIndex, LinkedList<Integer> subset, int size, int[] nums){
        if(subset.size()==size){
            this.res.add(new ArrayList<>(subset));
            return;
        }
        
        for(int i=currIndex; i<nums.length; i++){
            subset.addLast(nums[i]);
            backTrack(i+1, subset, size, nums);
            subset.removeLast();
        }
    }
}