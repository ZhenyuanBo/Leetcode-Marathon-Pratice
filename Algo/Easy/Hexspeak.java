class Solution {
    public String toHexspeak(String num) {
        String hex = hexHelper(num);
        return hex;
    }
    private String hexHelper(String num){
        long numRep = Long.parseLong(num);
        
        StringBuilder hex = new StringBuilder();
        
        while(numRep!=0){
            int rem = (int)(numRep%16);
            if(rem==10){
                hex.insert(0, 'A');
            }else if(rem==11){
                hex.insert(0, 'B');
            }else if(rem==12){
                hex.insert(0, 'C');
            }else if(rem==13){
                hex.insert(0, 'D');
            }else if(rem==14){
                hex.insert(0, 'E');
            }else if(rem==15){
                hex.insert(0, 'F');
            }else if(rem==1){
                hex.insert(0, 'I');
            }else if(rem==0){
                hex.insert(0, 'O');
            }else{
                return "ERROR";
            }
            numRep = numRep/16;
        }
        return hex.toString();
    }

}