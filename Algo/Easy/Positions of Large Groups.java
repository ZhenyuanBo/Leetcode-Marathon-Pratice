class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        char ch = S.charAt(0);
        
        int count=1;
        boolean isLargeGroup = false;
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        int start=0;
        
        for(int i=1; i<S.length(); i++){
            if(count>=3){
                isLargeGroup = true;
            }
            if(S.charAt(i) == ch){
                count++;
            }else{
                if(isLargeGroup){
                    List<Integer> indicies = new ArrayList<Integer>();
                    indicies.add(start);
                    indicies.add(i-1);
                    list.add(indicies);
                }
                start = i;
                count=1;
                isLargeGroup = false;
            }
            ch = S.charAt(i);
        }
        
        if(count>=3){
            List<Integer> indicies = new ArrayList<Integer>();
            indicies.add(start);
            indicies.add(S.length()-1);
            list.add(indicies);
        }
        
        return list;
    }
}