class Solution {
    public int diagonalSum(int[][] mat) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        
                
        int sum=0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i==j){
                    sum+=mat[i][j];
                    set.add(new Pair(i, j));
                }
            }
        }
        
        int j=mat[0].length-1;
        
        for(int i=0; i<mat.length; i++){
            if(set.add(new Pair(i,j))){
                sum+=mat[i][j];
            }
            j--;
        }

        return sum;
    }
}