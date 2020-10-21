class Solution {
    public int findComplement(int num) {
        
        StringBuilder numStr = new StringBuilder();
        
        while(num!=0){
            int remainder = num %2;
            numStr.insert(0, Integer.toString(remainder));
            num = num /2;
        }
        
        String numStrVal = numStr.toString();
        int j=0, sum=0;
        
        System.out.println(numStrVal);
        
        for(int i=numStrVal.length()-1; i>=0; i--){
            if(numStrVal.charAt(i)=='0'){
                sum+= 1*Math.pow(2,j);
            }
            j++;
        }
        
        return sum;
        
    }
}