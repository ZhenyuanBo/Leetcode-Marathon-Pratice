class Solution {
    public int balancedStringSplit(String s) {
        int numR = 0, numL=0;
        int count=0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='R') numR++;
            else if(ch=='L') numL++;
            
            if(numR == numL){
                count++;
                numR=0;
                numL=0;
            }
        }
        
        return count;
    }
}