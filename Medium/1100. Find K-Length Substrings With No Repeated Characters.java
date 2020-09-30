class Solution {
    public int numKLenSubstrNoRepeats(String S, int K) {
        int count=0;
        
        for(int i=0; i<S.length(); i++){
            if(i+K <=S.length() && hasRepeatedChars(S.substring(i, i+K))) count++;
        }
        
        return count;
    }
    private boolean hasRepeatedChars(String substr){
        Set<Character> s = new HashSet<>();
        
        for(char ch: substr.toCharArray()){
            if(!s.add(ch)) return false;
        }

        return true;
    }
}