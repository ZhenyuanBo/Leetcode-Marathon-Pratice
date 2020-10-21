class Solution {
    public int romanToInt(String s) {
        
        int i=0;
        int result=0;
        for(char ch: s.toCharArray()){
            if(i<s.length()-1 && lookUpTable(ch) < lookUpTable(s.charAt(i+1))){
                result -= lookUpTable(ch);
            }else{
                result += lookUpTable(ch);
            }
            i++;
        }
        
        return result;
        
    }
    private int lookUpTable(char ch){
        int ans=0;
        
        switch (ch){
            case 'I':
                ans=1;
                break;
            case 'V':
                ans=5;
                break;
            case 'X':
                ans=10;
                break;
            case 'L':
                ans=50;
                break;
            case 'C':
                ans=100;
                break;
            case 'D':
                ans=500;
                break;
            case 'M':
                ans=1000;
                break;
        }
        
        return ans;
    }
}