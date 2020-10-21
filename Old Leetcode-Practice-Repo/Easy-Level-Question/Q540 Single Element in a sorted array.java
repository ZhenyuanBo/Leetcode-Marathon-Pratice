class Solution {
    public int singleNonDuplicate(int[] nums) {

        Set<Integer> sortedSet = new HashSet<Integer>();
        int ans=0;

        for(Integer i: nums){
            if(!sortedSet.contains(i))
            	sortedSet.add(i);
            else
            	sortedSet.remove(i);
        }
        // for(Integer i: sortedSet){
        // 	ans = i;
        // 	break;
        // }
        Iterator itr = sortedSet.iterator();

        return itr.next();
    }
}