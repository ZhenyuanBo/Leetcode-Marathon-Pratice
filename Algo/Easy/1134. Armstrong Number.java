class Solution {
    public boolean isArmstrong(int N) {
        String val = String.valueOf(N);
        int numDigits = val.length();
        
        int num=0;
        
        for(int i=0; i<numDigits; i++){
            num += Math.pow(Character.getNumericValue(val.charAt(i)), numDigits);    
        }
        
        return num == N;
    }
}