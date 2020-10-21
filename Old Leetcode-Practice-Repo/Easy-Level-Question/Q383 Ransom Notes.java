class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        
        for(char ch: ransomNote.toCharArray()){
            int val = ransomNoteMap.getOrDefault(ch, 0)+1;
            ransomNoteMap.put(ch, val);
        }
        
        for(char ch: magazine.toCharArray()){
            int val = magazineMap.getOrDefault(ch, 0)+1;
            magazineMap.put(ch, val);
        }
        
        boolean res = true;
        
        for(char ch: ransomNote.toCharArray()){
            if(magazineMap.keySet().contains(ch)){
                if(magazineMap.get(ch)>0){
                    magazineMap.put(ch, magazineMap.get(ch)-1);
                }else{
                    res = false;
                    break;
                }
            }else{
                res = false;
                break;
            }
        }
        
        return res;
    }
}