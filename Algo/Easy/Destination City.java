class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> fromCityList = new ArrayList<>();
        for(List<String> path: paths){
            fromCityList.add(path.get(0));
        }
        
        String res="";
        
        for(List<String> path: paths){
            String des = path.get(1);
            if(!fromCityList.contains(des)){
                res = des;
                break;
            }
        }
        
        return res;
    }
}