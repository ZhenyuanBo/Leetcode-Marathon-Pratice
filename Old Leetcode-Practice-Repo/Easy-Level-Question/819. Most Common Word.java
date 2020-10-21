class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String[] modifiedPar = paragraph.split("[\\p{Punct}\\s]+");
        Set<String> set = new HashSet<String>(Arrays.asList(banned));
        Map<String, Integer> lookupMap = new HashMap<String, Integer>();
        int maxVal = Integer.MIN_VALUE;
        
        for(String str: modifiedPar){
            if(!set.contains(str.toLowerCase())){
                int count = lookupMap.getOrDefault(str.toLowerCase(), 0)+1;
                lookupMap.put(str.toLowerCase(), count);
            }
        }
        
        for(String key: lookupMap.keySet()){
            maxVal = Math.max(maxVal, lookupMap.get(key));
        }
        
        String res = new String();
        
        for(String key: lookupMap.keySet()){
            if(lookupMap.get(key) == maxVal){
                res = key;
                break;
            }
        }
        
        return res;

    }
}
/*
solution:
public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word : banned) if(map.containsKey(word)) map.remove(word);
        String res = null;
        for(String word : map.keySet())
            if(res == null || map.get(word) > map.get(res))
                res = word;
        return res;
    }
*/