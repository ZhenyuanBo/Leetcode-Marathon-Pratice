class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();
        backTrack(n,k,comb,1);
        return res;
    }
    private void backTrack(int n, int k, LinkedList<Integer> comb, int curr){
        if(comb.size()==k){
            this.res.add(new ArrayList<>(comb));
            return;
        }
        
        for(int i=curr; i<=n; i++){
            //place potential candidate on the path
            comb.addLast(i);
            backTrack(n, k, comb, i+1);
            comb.removeLast();
        }
    }
    
}