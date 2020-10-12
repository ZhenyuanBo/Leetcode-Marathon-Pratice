class Solution {
    public int minFlips(String target) {
        
        char[] targetArr = target.toCharArray();
        
        int count=0, startIndex=0;
        
        boolean hasOne = false;
        
        for(int i=0; i<targetArr.length; i++){
            if(targetArr[i]=='1'){
                startIndex = i;
                hasOne = true;
                break;
            }
        }

        for(int i=startIndex; i<targetArr.length; i++){
            if(i+1<targetArr.length && targetArr[i]!=targetArr[i+1]){
                count++;
            }
        }

        return hasOne ? count+1 : count;
    }
}