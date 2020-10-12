class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");
        int minIndex = Integer.MAX_VALUE;
        
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(searchWord)==0){
                minIndex = Math.min(i+1, minIndex);
            }
        }
        
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}