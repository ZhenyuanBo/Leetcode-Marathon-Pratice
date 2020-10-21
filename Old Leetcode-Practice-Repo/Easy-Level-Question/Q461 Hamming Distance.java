class Solution {
    public int hammingDistance(int x, int y) {
        
        if(x ==0 && y==0) return 0;
        
        StringBuilder bitRepX = new StringBuilder();
        StringBuilder bitRepY = new StringBuilder();
        
        while(x!=0){
            int remainder = x%2;
            bitRepX.insert(0, Integer.toString(remainder));
            x = x/2;
        }
        
        while(y!=0){
            int remainder = y%2;
            bitRepY.insert(0, Integer.toString(remainder));
            y = y/2;
        }
        
        int strXLen = bitRepX.length();
        int strYLen = bitRepY.length();
        
        StringBuilder newBitRepX = new StringBuilder(bitRepX);
        StringBuilder newBitRepY = new StringBuilder(bitRepY);
        
        int lenDiff = Math.abs(strXLen - strYLen);
        
        if(strXLen < strYLen){
            while(lenDiff!=0){
                newBitRepX.insert(0, "0");
                lenDiff--;
            }
        }else{
            while(lenDiff!=0){
                newBitRepY.insert(0,"0");
                lenDiff--;
            }
        }
        
        int diff=0;
        int index=0;
        
        while(true){
            if(newBitRepX.toString().charAt(index) != newBitRepY.toString().charAt(index)){
                diff++;
            }
            
            index++;
            
            if(index == newBitRepX.toString().length()) break;
        }
        
        return diff;
    }
};