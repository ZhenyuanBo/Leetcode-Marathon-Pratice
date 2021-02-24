class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        char[] sArr = s.toCharArray();
        String val = "";
        boolean hasSeenSign = false;
        boolean hasSeenDigit = false;

        for(char ch: sArr){
            if(ch==' ' && !hasSeenSign && !hasSeenDigit) continue;
            else if((ch=='-' || ch=='+') && !hasSeenSign && !hasSeenDigit){
                val+=ch;
                hasSeenSign = true;
            }else if(Character.isDigit(ch)){
                hasSeenDigit = true;
                val+=ch;
            }else if(!Character.isDigit(ch)){
                break;
            }
        }
        
        
        if(val.equals("") || val.length()==1 && (val.charAt(0)=='-' || val.charAt(0)=='+')) return 0;
        
        char[] valArr = val.toCharArray();
        
        long result = 0;
        int count = 0;
        
        boolean hasClamped = false;
        
        for(int i=valArr.length-1; i>=0; i--){
            
            if(valArr[i]=='-' || valArr[i]=='+') break;
            
            long currDigit = valArr[i]-'0';
            long currVal = (long)Math.pow(10, count) * currDigit;
            long currSum = result + currVal;

            if(currSum > Integer.MAX_VALUE || Math.pow(10, count) * currDigit > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
                hasClamped = true;
                break;
            }else{
                if(currDigit!=0) result += currVal;
            }
            
            count++;
        }
        
        if(valArr[0]=='-'){
            if(result == Integer.MAX_VALUE && hasClamped) return Integer.MIN_VALUE;
            else return (-1)*(int)result;
        }
        
        return (int)result;
        
    }
}