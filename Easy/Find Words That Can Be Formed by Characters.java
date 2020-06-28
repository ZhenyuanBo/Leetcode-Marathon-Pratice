class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charArr = new int[26];
        int len=0;
        
        for(char ch: chars.toCharArray()){
            int index = ch-'a';
            charArr[index]++;
        }
        for(String word: words){
            if(isGoodStr(word, charArr.clone())){
               len+=word.length(); 
            }
        }
        return len;
    }
    private boolean isGoodStr(String word, int[] charArr){
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(charArr[index]>0){
                charArr[index]--;
            }else{
                return false;
            }
        }
        return true;
    }

}