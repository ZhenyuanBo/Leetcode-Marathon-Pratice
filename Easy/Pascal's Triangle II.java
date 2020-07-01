class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        if(rowIndex==0){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            return newList;
        }else if(rowIndex==1){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            newList.add(1);
            return newList;
        }else{
            List<Integer> prevList = getRow(rowIndex-1);
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int i=0; i+1<prevList.size(); i++){
                int sum = prevList.get(i) + prevList.get(i+1);
                newList.add(sum);
            }
            newList.add(1);
            return newList;
        }
        
    }
}