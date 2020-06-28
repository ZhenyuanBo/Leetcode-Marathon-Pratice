class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        
        Arrays.sort(arr);
        
        //find min diff
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length-1; i++){
            minDiff = Math.min(minDiff, Math.abs(arr[i]-arr[i+1]));
        }
        
        for(int i=0; i<arr.length-1; i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff==minDiff){
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                resList.add(pair);
            }
        }
        
        return resList;
    }
}