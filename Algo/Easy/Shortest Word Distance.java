class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        for(int i=0; i<words.length; i++){
            if(map.containsKey(words[i])){
                List<Integer> list = map.get(words[i]);
                list.add(i);
                map.put(words[i], list);
            }else{
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(words[i], list);
            }
        }
        
        List<Integer> word1Indices = map.get(word1);
        List<Integer> word2Indices = map.get(word2);
        
        int minDistance = Integer.MAX_VALUE;
        
        for(int i=0; i<word2Indices.size(); i++){
            for(int j=0; j<word1Indices.size(); j++){
                minDistance = Math.min(Math.abs(word2Indices.get(i) - word1Indices.get(j)), minDistance);
            }
        }
        
        return minDistance;
    }
}