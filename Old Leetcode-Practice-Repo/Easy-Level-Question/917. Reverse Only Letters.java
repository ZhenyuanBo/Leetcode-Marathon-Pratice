class Solution {
    public String reverseOnlyLetters(String S) {
        char[] charArr = S.toCharArray();
        String modifiedS = new String();
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i=0; i<charArr.length; i++){
            if(Character.isLetter(charArr[i])){
                modifiedS+=charArr[i];
                continue;
            }else{
                map.put(i, charArr[i]);
            }
        }
        
        char[] resArr = new char[S.length()];
        
        for(Integer i: map.keySet()){
            resArr[i] = map.get(i);
        }
        
        int j=0;
        
        for(int i=modifiedS.length()-1; i>=0;){
            if(resArr[j]==0){
                resArr[j] = modifiedS.charAt(i);
                i--;
                j++;
            }else if(resArr[j]!=0){
                j++;
            }
        }
        
        String res = new String();
        
        for(char ch: resArr){
            if(ch!=0) res+=ch;
        }
        
        return res;
        
    }
}