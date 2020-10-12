class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int j=0, i=0, count=0, maxLen=0;
        
        while(j<s.length()){
            while(i<s.length()){
                int scharVal = Character.getNumericValue(s.charAt(i));
                int tcharVal = Character.getNumericValue(t.charAt(i));
                int diff = Math.abs(scharVal - tcharVal);
                if(count+diff>maxCost){
                    break;
                }else{
                    count += diff;
                }
                i++;
            }
            
            maxLen = Math.max(maxLen, i-j); 
            if(i==s.length()) break;
            int sleftVal = Character.getNumericValue(s.charAt(j));
            int tleftVal = Character.getNumericValue(t.charAt(j));
            count -= Math.abs(sleftVal - tleftVal);
            j++;
        }
        
        return maxLen;
    }
}