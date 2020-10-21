class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> referenceSet = new HashSet<Integer>();
        Set<Integer> numsSet = new HashSet<Integer>();
        
        int[] ans = new int[2];
        
        for(int i=1;i<=nums.length;i++){
            referenceSet.add(i);
        }
        
        for(int i:nums){
            if(!numsSet.add(i)){
                ans[0]=i;
            }else if(referenceSet.contains(i)){
                referenceSet.remove(i);
            }
        }
       
        Iterator<Integer> iterator = referenceSet.iterator();
        ans[1] = (int)iterator.next();
        
        
        return ans;
        
    }
}