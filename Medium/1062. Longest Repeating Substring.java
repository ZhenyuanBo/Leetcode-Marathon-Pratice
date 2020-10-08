class Solution {
    public int longestRepeatingSubstring(String S) {
        int size=1;
        int maxLen = 0;
        
        while(size<S.length()){
            Set<String> substrSet = new HashSet<>();
            for(int i=0; i<S.length(); i++){
                String str="";
                if(i+size<=S.length()){
                    str = S.substring(i, i+size);
                }
                if(!str.equals("") && !substrSet.add(str)){
                    maxLen = Math.max(maxLen, str.length());
                    break;
                }
            }
            size++;
        }
        
        return maxLen;
    }
}