class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        path.addLast(0);
        backTrack(graph, 0, path, graph.length-1);
        return this.res;
    }
    private void backTrack(int[][] graph, int currNode, LinkedList<Integer> path, int target){
        if(currNode==target){
            this.res.add(new ArrayList<>(path));
        }
        
        for(int neiNode: graph[currNode]){
            //place node on the path
            path.addLast(neiNode);
            backTrack(graph, neiNode, path, target);
            path.removeLast();
        }
    }
}