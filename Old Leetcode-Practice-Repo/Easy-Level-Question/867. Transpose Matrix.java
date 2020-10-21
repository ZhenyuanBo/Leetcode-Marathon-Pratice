class Solution {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<A[0].length;i++){
            List<Integer> subList = new ArrayList<Integer>();
            for(int j=0; j<A.length; j++){
                subList.add(A[j][i]);
            }
            list.add(subList);
        }
        System.out.println(list);
        for(int i=0; i<A[0].length; i++){
            for(int j=0; j<A.length; j++){
                result[i][j] = list.get(i).get(j);
            }
        }
        return result;
        
    }
}