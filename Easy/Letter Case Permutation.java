class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack(S, "", 0, res);
        return res;
    }
    private void backTrack(String S, String str, int currPos, List<String> res){
        if(currPos == S.length()){
            res.add(str);
            return;
        }
        
        char ch = S.charAt(currPos);
        if(!Character.isDigit(ch)){
            ch = transformChar(ch);
            backTrack(S, str+ch, currPos+1, res);
        }
        backTrack(S, str+S.charAt(currPos), currPos+1, res);
    }
    private char transformChar(char ch){
        char newCh = ' ';
        if(Character.isLowerCase(ch)){
            newCh =  Character.toUpperCase(ch);
        }else if(Character.isUpperCase(ch)){
            newCh =  Character.toLowerCase(ch);
        }
        return newCh;
    }
}