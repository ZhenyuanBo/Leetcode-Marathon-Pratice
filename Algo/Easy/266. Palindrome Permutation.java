class Solution {
    public boolean canPermutePalindrome(String s) {
        int len = s.length();
        int count = len/2;
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int freq = map.getOrDefault(ch, 0)+1;
            map.put(ch, freq);
        }
        
        int num=0;
        
        for(Character key: map.keySet()){
           if(map.get(key)>1){
               num++;
           } 
        }
        
        return num==count || map.keySet().size()==1;
        
    }
}