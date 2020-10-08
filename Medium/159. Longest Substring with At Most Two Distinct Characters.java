class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int leftPointer = 0;
        int rightPointer = 1;
        int maxLen = 0;
        while(leftPointer<s.length()){
            while(rightPointer<=s.length() && has2DistinctCharacters(s, leftPointer, rightPointer)){
                rightPointer++;
            }
            maxLen = Math.max(maxLen, rightPointer-leftPointer-1);
            leftPointer++;
        }
        return maxLen;
    }
    private boolean has2DistinctCharacters(String s, int start, int end){
        
        String substr = s.substring(start, end);
        
        Set<Character> set = new HashSet<>();
        
        for(char ch: substr.toCharArray()){
            set.add(ch);
        }

        return set.size()<=2;
    }
}