class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        List<Integer> arr1List = new ArrayList<>();
        for(int i: arr1){
            arr1List.add(i);
        }
        
        Set<Integer> dupSet1 = new HashSet<Integer>();
        Set<Integer> dupSet2 = new HashSet<Integer>();
        
        for(int i: arr2){
            if(arr1List.contains(i)){
                dupSet1.add(i);
            }
        }
        
        for(int i: arr3){
            if(!dupSet1.add(i)){
                dupSet2.add(i);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(Integer val: dupSet2){
            res.add(val);
        }
        
        Collections.sort(res);
        
        return res;
    }
}