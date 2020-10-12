class Solution {
    Set<List<Integer>> set;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        set = new HashSet<>();
        Arrays.sort(nums);
        LinkedList<Integer> subset = new LinkedList<>();
        for(int i=0; i<=nums.length; i++){
            backTrack(0, subset, i, nums);
        }
        return new ArrayList<>(set);
    }
    private void backTrack(int currIndex, LinkedList<Integer> subset, int size, int[] nums){
        if(subset.size()==size){
            this.set.add(new ArrayList<>(subset));
            return;
        }
        
        for(int i=currIndex; i<nums.length; i++){
            subset.addLast(nums[i]);
            backTrack(i+1, subset, size, nums);
            subset.removeLast();
        }
    }
}