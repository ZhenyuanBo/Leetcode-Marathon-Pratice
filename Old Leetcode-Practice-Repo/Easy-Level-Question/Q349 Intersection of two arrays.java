class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

    	Set<Integer> intersectionSet = new HashSet<Integer>();
        Set<Integer> nums1Set = new HashSet<Integer>();
        
        for(int n: nums1){
            nums1Set.add(n);
        }

    	for(int n:nums2){
    		if(nums1Set.contains(n)){
    			intersectionSet.add(n);
    		}
    	}

    	int[] res = new int[intersectionSet.size()];

    	int j=0;

    	for(Integer i: intersectionSet){
    		res[j] = i;
    		j++;
    	}
        
        return res;
    }
}