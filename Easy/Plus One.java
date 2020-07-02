class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int sum=0;
        
        for(int i=digits.length-1; i>=0; i--){
            if(i==digits.length-1){
                sum = digits[i] + 1;
            }else{
                sum = digits[i] + carry; 
            }
            if(sum>=10){
                carry = sum/10;
            }else{
                carry=0;
            }
            digits[i] = sum%10;
        }
        
        int len = carry>0 ? digits.length+1: digits.length;
        
        int[] res = new int[len];
        
        if(carry>0) res[0] = carry;
        
        for(int i=0; i<digits.length; i++){
            if(carry>0){
                res[i+1] = digits[i];
            }else{
                res[i] = digits[i];
            }
        }
        
        return res;
        
    }
}