class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int startIndex = m;
        int endIndex = m+n;
        
        int j=0;
        
        for(int i=startIndex; i<endIndex; i++){
            nums1[i] = nums2[j];
            j++;
        }
        
        Arrays.sort(nums1);
    
    }
}