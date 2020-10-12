class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int r=0; r+1<mat.length; r++){
            for(int c=0; c<mat[0].length; c++){
                List<Integer> diagonalList = sortedList(mat, r, c);
                Collections.sort(diagonalList);
                modifyMat(mat, diagonalList, r, c);
            } 
        }
        return mat;
    }
    private List<Integer> sortedList(int[][] mat, int r, int c){
        if(r+1>=mat.length || c+1>=mat[0].length){
            List<Integer> list = new ArrayList<Integer>();
            list.add(mat[r][c]);
            return list;
        }else{
            List<Integer> resList = sortedList(mat, r+1, c+1);
            resList.add(mat[r][c]);
            return resList;
        }
    }
    private void modifyMat(int[][] mat, List<Integer> list, int r, int c){
        int j=c;
        int k=0;
        for(int i=r; i<mat.length; i++){
            if(j+1<=mat[0].length){
                mat[i][j] = list.get(k);
                j++;
                k++;  
            }else{
                break;
            }
        }
    }
}