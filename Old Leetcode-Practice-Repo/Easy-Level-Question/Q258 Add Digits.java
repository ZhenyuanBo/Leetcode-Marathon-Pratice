class Solution {
    public int addDigits(int num) {
        
        int numDigit = Integer.toString(num).length();
        if(numDigit == 1) return num;
        
        int sum=0;
        
        while(numDigit != 0){
            int remainder = num % 10;
            sum+=remainder;
            num = num/10;
            numDigit--;
        }
        System.out.println(sum);
        return addDigits(sum);   
        
    }
    
}