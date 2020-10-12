class Solution {
    public int[][] indexPairs(String text, String[] words) {
        
        TreeMap<Integer, List<Integer>> tmap = new TreeMap<>();
        
        for(String word: words){
            int wordLen = word.length();
            for(int i=0; i+wordLen<=text.length(); i++){
                String str = text.substring(i, i+wordLen);
                if(str.equals(word)){
                    if(tmap.containsKey(i)){
                        List<Integer> list = tmap.get(i);
                        list.add(i+wordLen-1);
                        tmap.put(i, list);
                    }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(i+wordLen-1);
                        tmap.put(i, list);
                    }
                }
            }
        }
        
        int size=0;
        
        for(Integer key: tmap.keySet()){
            size+=tmap.get(key).size();
        }
        
        int[][] ans = new int[size][2];
        
        int i=0;
        
        for(Integer key: tmap.keySet()){
            Collections.sort(tmap.get(key));
            for(Integer index: tmap.get(key)){
                ans[i][0]=key;
                ans[i][1] = index;
                i++;
            }
        }
        
        return ans;
    }
}