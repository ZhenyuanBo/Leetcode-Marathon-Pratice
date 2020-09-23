class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        
        for(int i=0; i<groupSizes.length; i++){
            int grSize = groupSizes[i];
            if(map.containsKey(grSize)){
                List<List<Integer>> list = map.get(grSize);
                if(list.get(list.size()-1).size()<grSize){
                    list.get(list.size()-1).add(i);
                }else if(list.get(list.size()-1).size()==grSize){
                    List<Integer> newgroup = new ArrayList<>();
                    newgroup.add(i);
                    list.add(newgroup);
                }
            }else{
                List<List<Integer>> grList = new ArrayList<>();
                List<Integer> gr = new ArrayList<>();
                gr.add(i);
                grList.add(gr);
                map.put(grSize, grList);
            }
        }

        List<List<Integer>> resList = new ArrayList<>();
        
        for(List<List<Integer>> list: map.values()){
            for(List<Integer> gr: list){
                resList.add(gr);
            }
        }
        
        return resList;
    }
}