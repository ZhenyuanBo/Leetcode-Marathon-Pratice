class Solution {
    public int numDistinctIslands(int[][] grid) {
        Set<List<Integer>> disPath = new HashSet<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    List<Integer> path = new ArrayList<Integer>();
                    dfs(grid, i, j, path, visited, 0);
                    if(!path.isEmpty()) disPath.add(path);
                }
            }
        }
        return disPath.size();
    }
    private void dfs(int[][] grid, int i, int j, List<Integer> path, boolean[][] visited, int sig){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || visited[i][j]) return;
        
        visited[i][j] = true;
        
        path.add(sig);
        dfs(grid, i+1, j, path, visited, 1);
        dfs(grid, i-1, j, path, visited, 2);
        dfs(grid, i, j+1, path, visited, 3);
        dfs(grid, i, j-1, path, visited, 4);
        path.add(0);
    }
}