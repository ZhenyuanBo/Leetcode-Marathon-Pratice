class SparseVector {
    int[] vector;
    
    SparseVector(int[] nums) {
        vector = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                vector[i] = nums[i];
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int sum=0;
        
        for(int i=0; i<vector.length; i++){
            if(vector[i]==0 || vec.vector[i]==0) continue;
            else
                sum += vector[i] * vec.vector[i];
        }
        
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);