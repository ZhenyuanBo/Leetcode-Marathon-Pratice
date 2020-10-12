class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final List<int[]> dirs = Arrays.asList(
        new int[]{-1, 0},
        new int[]{1,0},
        new int[]{0, 1},
        new int[]{0, -1}
    );
    public void wallsAndGates(int[][] rooms) {
        //build a queue
        Queue<int[]> q = new LinkedList<>();
        int r = rooms.length;
        if(r==0) return;
        int c = rooms[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rooms[i][j]==0) q.add(new int[]{i, j});
            }
        }
        
        while(!q.isEmpty()){
            int[] currPos = q.poll();
            for(int[] dir: dirs){
                int rmove = dir[0];
                int cmove = dir[1];
                int finalr = currPos[0] + rmove;
                int finalc = currPos[1] + cmove;
                if(finalr<0 || finalc>=c || finalr>=r || finalc<0 || rooms[finalr][finalc]!=EMPTY) continue;
                rooms[finalr][finalc] = rooms[currPos[0]][currPos[1]] + 1;
                q.add(new int[]{finalr, finalc});
            }
        }
    }
}