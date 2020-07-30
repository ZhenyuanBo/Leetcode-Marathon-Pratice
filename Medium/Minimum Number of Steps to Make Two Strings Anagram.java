class Solution {
    public int minSteps(String s, String t) {
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            int freq = smap.getOrDefault(ch, 0)+1;
            smap.put(ch, freq);
        }
        
        for(char ch: t.toCharArray()){
            int freq = tmap.getOrDefault(ch, 0)+1;
            tmap.put(ch, freq);
        }
        
        int ans=0;

        for(Character key: smap.keySet()){
            if(tmap.containsKey(key)){
                if(smap.get(key)>tmap.get(key)) ans+= smap.get(key) - tmap.get(key);
            }else{
                ans+=smap.get(key);
            }
        }
        
        return ans;
    }
}