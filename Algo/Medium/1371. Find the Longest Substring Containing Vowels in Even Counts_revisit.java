
class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        
        int maxLen = 0;
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            Map<Character, Integer> temp = new HashMap<>();
            temp.put('a', map.get('a'));
            temp.put('e', map.get('e'));
            temp.put('i', map.get('i'));
            temp.put('o', map.get('o'));
            temp.put('u', map.get('u'));
            
            int j=0;
            
            //check the left boundary and remove the vowel to make it even
            while(temp.get('a')%2==1 || temp.get('e')%2==1 || temp.get('i')%2==1 || temp.get('o')%2==1 || temp.get('u')%2==1){
                if(temp.containsKey(s.charAt(j))){
                    temp.put(s.charAt(j), temp.get(s.charAt(j))-1);
                }
                j++;
            }
            maxLen = Math.max(i-j+1, maxLen);
        }
        
        return maxLen;
    }
}