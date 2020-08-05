class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int s1Len = s1.length();
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch: s1.toCharArray()){
            int freq = map.getOrDefault(ch, 0)+1;
            map.put(ch, freq);
        }
        
        int start=0, end;
        
        for(end=0; end<s2.length(); end++){
            if(end-start+1 == s1Len){
                String substr = s2.substring(start, end+1);
                if(isPermutation(map, substr)) return true;
                else start++;
            }
        }
        
        return false;
    }
    private boolean isPermutation(Map<Character, Integer> map, String substr){
        Map<Character, Integer> substrmap = new HashMap<>();
        
        for(char ch: substr.toCharArray()){
            substrmap.put(ch, substrmap.getOrDefault(ch, 0)+1);
        }
        
        for(char ch: substr.toCharArray()){
            if(map.containsKey(ch)){
                if(!substrmap.get(ch).equals(map.get(ch))) return false;
            }else{
                return false;
            }
        }
        
        return true;
    }
}