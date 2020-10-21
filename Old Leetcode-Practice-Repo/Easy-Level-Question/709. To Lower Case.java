class Solution {
    public String toLowerCase(String str) {
        String newString = new String();
        for(char ch: str.toCharArray()){
            if(ch>=65 && ch<=90) ch = (char)(ch+32);
            newString += ch;
        }
        return newString;
    }
}