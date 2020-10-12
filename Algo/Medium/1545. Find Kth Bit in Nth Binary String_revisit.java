class Solution {
    public char findKthBit(int n, int k) {
        int i=1;
        String prevStr = "0";
        
        while(i<=n){
            prevStr = prevStr + "1" + modifyStr(prevStr);
            i++;
        }
        
        return prevStr.charAt(k-1);
    }
    private String modifyStr(String str){

        StringBuilder buffer = new StringBuilder("");
        for(char ch: str.toCharArray()){
            buffer.append(ch=='1' ? '0' : '1');
        }
        return buffer.reverse().toString();
    }
}