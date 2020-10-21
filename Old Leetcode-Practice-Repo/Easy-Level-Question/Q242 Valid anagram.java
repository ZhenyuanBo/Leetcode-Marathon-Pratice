class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        
        for(Character ch: s.toCharArray()){
            sMap.put(ch, sMap.getOrDefault(ch,0)+1);
        }
        
        for(Character ch: t.toCharArray()){
            tMap.put(ch, tMap.getOrDefault(ch,0)+1);
        }
        
        for(Character ch: sMap.keySet()){
            if(!sMap.get(ch).equals(tMap.get(ch))){
                return false;
            }
        }
        
        return true;
    }
}