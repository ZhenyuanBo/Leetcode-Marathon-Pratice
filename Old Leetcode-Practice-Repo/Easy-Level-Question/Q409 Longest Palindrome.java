class Solution {
    public int longestPalindrome(String s) {
        Set<Character> sSet = new HashSet<Character>();
        int count=0;
        
        for(char ch: s.toCharArray()){
            if(sSet.contains(ch)){
                sSet.remove(ch);
                count++;
            }else{
                sSet.add(ch);
            }
        }
        
        if(sSet.isEmpty()){
            return count*2;
        }
        
        return count*2+1;
    }
}