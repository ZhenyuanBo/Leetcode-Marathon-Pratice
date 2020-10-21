class Solution {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int counter=0;
        for(int i=0; i<M.length;i++){
            if(visited[i]==0){
                DFS(M, visited, i);
                counter++;
            }
        }
        return counter;
        
    }
    private void DFS(int[][] M, int[] visited, int i){
        for(int j=0;j<M[0].length;j++){
            if(M[i][j]==1 && visited[j]==0){
                visited[j]=1;
                DFS(M, visited, j);
            }
        }
    }
}