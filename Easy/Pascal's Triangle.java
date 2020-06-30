class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0; i<numRows; i++){
            List<Integer> rowList = new ArrayList<Integer>();
            if(i==0){
                rowList.add(1);
            }else if(i==1){
                rowList.add(1);
                rowList.add(1);
            }else{
                List<Integer> prevList = list.get(i-1);
                System.out.println(prevList);
                rowList.add(1);
                for(int j=0; j<prevList.size()-1; j++){
                    int sum = prevList.get(j) + prevList.get(j+1); 
                    rowList.add(sum);
                }
                rowList.add(1);
            }
            list.add(rowList);
        }
        
        return list;
    }
}