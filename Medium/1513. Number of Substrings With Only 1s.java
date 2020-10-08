class Solution {
    public int numSub(String s) {
        long totalCount=0;
        long count=0;
        for(int i=0; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)=='0'){
                count = (1+count)*count/2;
                totalCount += count;
                count=0;
            }else{
                count++;
            }
        }
        
        return (int)(totalCount%(Math.pow(10, 9)+7)); //convert large long to int value
    }
}
