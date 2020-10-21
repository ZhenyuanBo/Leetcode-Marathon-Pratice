class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<String, Integer>();
        Map<String, Integer> list2Map = new HashMap<String, Integer>();
        Map<String, Integer> commonMap = new HashMap<String, Integer>();
        
        for(int i=0; i<list1.length; i++){
            list1Map.put(list1[i],i);
        }
        
        for(int i=0; i<list2.length; i++){
            list2Map.put(list2[i],i);
        }
        
        int minIndexSum=Integer.MAX_VALUE;
        
        for(String str: list1Map.keySet()){
            if(list2Map.keySet().contains(str)){
                int indexSum = list1Map.get(str) + list2Map.get(str);
                commonMap.put(str, indexSum);
                minIndexSum = Math.min(minIndexSum, indexSum);
            }
        }
        
        List<String> commonStr = new ArrayList<String>();
        
        for(String str: commonMap.keySet()){
            int val = commonMap.get(str);
            if(val == minIndexSum){
                commonStr.add(str);
            }
        }
        
        String[] ans = new String[commonStr.size()];
        int index=0;
        
        for(String str: commonStr){
            ans[index] = str;
            index++;
        }
        
        return ans;
    }
}