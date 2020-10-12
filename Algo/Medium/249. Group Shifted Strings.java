class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        boolean[] visited = new boolean[strings.length];
        
        for(int i=0; i<strings.length; i++){
            if(!map.containsKey(strings[i]) && !visited[i]){
                List<String> group = new ArrayList<>();
                group.add(strings[i]);
                map.put(strings[i], group);
            }else{
                continue;
            }
            for(int j=i+1; j<strings.length; j++){
                if(belongToSameGroup(strings[i], strings[j])){
                    map.get(strings[i]).add(strings[j]);
                    visited[j] = true;
                }
            }
        }
        
        for(List<String> group: map.values()){
            list.add(group);
        }
        
        return list;

    }
    private boolean belongToSameGroup(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        
        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();
        
        int diff = str1arr[0]-str2arr[0] < 0 ? str1arr[0]-str2arr[0] + 26 : str1arr[0]-str2arr[0];
        
        for(int i=1; i<str1arr.length; i++){
            int newdiff = str1arr[i]-str2arr[i]<0 ? str1arr[i]-str2arr[i]+26:str1arr[i]-str2arr[i];
            if(newdiff!=diff) return false;
        }
        
        return true;
    }
}