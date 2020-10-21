class Solution {
    public boolean hasAlternatingBits(int n) {
        
        StringBuilder strRep = new StringBuilder();
        
        while(n!=0){
            int remainder = n%2;
            strRep.append(Integer.toString(remainder));
            n=n/2;
        }
        
        int j=0;
        char prevChar = strRep.toString().charAt(j);
        
        for(int i=1;i<strRep.toString().length();i++){
            if(strRep.toString().charAt(i) == prevChar) return false;
            else{
                j++;
                prevChar = strRep.toString().charAt(j);
            }
        }
        
        return true;
        
    }
}