class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> items = new HashSet<>();
        
        for(int i=0; i<orders.size(); i++){
            items.add(orders.get(i).get(2));
        }
        
        List<String> headers = new ArrayList<>();
        headers.addAll(items);
        
        headers.sort(Comparator.comparing( String::toString )); 
        
        headers.add(0, "Table");
        
        System.out.println(headers);
        
        List<List<String>> res = new ArrayList<>();
        
        res.add(headers);
        
        TreeMap<Integer, List<String>> tmap = new TreeMap<>();
        
        for(int i=0; i<orders.size(); i++){
            int tableNum = Integer.parseInt(orders.get(i).get(1));
            if(tmap.containsKey(tableNum)){
                List<String> foodItems = tmap.get(tableNum);
                foodItems.add(orders.get(i).get(2));
                tmap.put(tableNum, foodItems);
            }else{
                List<String> foodItems = new ArrayList<>();
                foodItems.add(orders.get(i).get(2));
                tmap.put(tableNum, foodItems);
            }
        }
        
        for(Integer key: tmap.keySet()){
            List<String> list = tmap.get(key);
            List<String> tableItems = new ArrayList<>();
            tableItems.add(Integer.toString(key));
            for(int i=1; i<headers.size(); i++){
                String search = headers.get(i);
                int num=0;
                for(String item: list){
                    if(search.equals(item)){
                        num++;
                    }
                }
                tableItems.add(Integer.toString(num));
            }
            res.add(tableItems);
        }
        
        return res;
    }
}