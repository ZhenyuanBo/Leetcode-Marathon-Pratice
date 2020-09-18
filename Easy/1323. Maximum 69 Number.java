class Solution {
    public int maximum69Number (int num) {
        String val = Integer.toString(num);
        char[] digitArray = val.toCharArray();
        int res=0;
        
        for(int i=0; i<digitArray.length; i++){
            if(digitArray[i]=='6'){
                digitArray[i] = '9';
                break;
            }
        }
        
        int j=0;
        for(int i=digitArray.length-1; i>=0; i--){
            res += Math.pow(10, i)*(Character.getNumericValue(digitArray[j]));
            j++;
        }
        
        return res;
    }
}