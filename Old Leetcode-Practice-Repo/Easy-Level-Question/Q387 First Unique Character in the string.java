class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        
        for(char ch: s.toCharArray()){
            sMap.put(ch, sMap.getOrDefault(ch,0)+1);
        }
        
        boolean found = false;
        int index=Integer.MAX_VALUE;
        
        for(Character ch: sMap.keySet()){
            if(sMap.get(ch) == 1){
                found = true;
                char chInterest = ch;
                index=Math.min(index, s.indexOf(chInterest));
            }
        }
        
        if(found){
            return index;
        }
        
        return -1;
    }
}