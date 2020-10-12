class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<index.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
}