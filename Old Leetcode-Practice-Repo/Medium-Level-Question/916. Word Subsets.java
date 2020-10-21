class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] ref = new int[26];
        List<String> list = new ArrayList<String>();
        
        for(String strB: B){
            int[] strBArr = helper(strB);
            for(int i=0; i<26; i++){
                ref[i] = Math.max(ref[i], strBArr[i]);
            }
        }
        for(String strA: A){
            int[] strAArr = helper(strA);
            boolean isValid=true;
            for(int i=0; i<26; i++){
                if(strAArr[i]<ref[i]){
                    isValid=false;
                    break;
                }
            }
            if(isValid) list.add(strA);
        }
        return list;
    }
    public int[] helper(String str){
        int[] strArr = new int[26];
        for(char ch: str.toCharArray()){
            int index = ch-'a';
            strArr[index]++;
        }
        return strArr;
    }
    
}