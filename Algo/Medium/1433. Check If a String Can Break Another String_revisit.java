class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        if(s1.length()==0 && s2.length()==0) return true;
        
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        
        boolean isS1 = true;
        boolean isS2 = true;
        
        for(int i=0; i<s1Arr.length; i++){
            if(s1Arr[i] < s2Arr[i]){
                isS1 = false;
                break;
            }
        }
        
        for(int i=0; i<s2Arr.length; i++){
            if(s2Arr[i]<s1Arr[i]){
                isS2 = false;
                break;
            }
        }

        return isS1 || isS2;
    }
}
