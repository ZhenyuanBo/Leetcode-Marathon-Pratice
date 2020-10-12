class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> list = new ArrayList<Integer>();
       for(int i=0; i<matrix.length; i++){
           int[] r = matrix[i];
           int rMin = Integer.MAX_VALUE;
           int cMax = Integer.MIN_VALUE;
           int minIndex=0;
           for(int j=0; j<r.length; j++){
               if(r[j]<rMin){
                   minIndex=j;
                   rMin=r[j];
               }
           }
           for(int k=0; k<matrix.length; k++){
               cMax = Math.max(cMax, matrix[k][minIndex]);
           }
           if(cMax==rMin){
               list.add(cMax);
           }
       }
       return list;
    }
}