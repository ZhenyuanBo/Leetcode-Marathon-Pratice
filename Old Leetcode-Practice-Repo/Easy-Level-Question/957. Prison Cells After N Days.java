class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] res = new int[cells.length];
        //after 14 times, the state pattern will repeat
        N=N%14;
        if(N==0) N=14;
        for(int i=0; i<N; i++){
            res = helper(cells);
            cells=res;
        }
        return res;
    }
    public int[] helper(int[] cells){
        int[] res = new int[cells.length];
        for(int i=1; i<cells.length-1; i++){
            if(cells[i-1]==cells[i+1]) res[i] = 1;
            else res[i]=0;
        }
        return res;
    }
}