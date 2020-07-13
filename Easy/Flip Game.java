class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        
        for(int i=0; i+1<s.length(); i++){
            if(s.charAt(i)=='+' && s.charAt(i+1)=='+'){
                String str = "";
                if(i+2<s.length()){
                    str = s.substring(0, i) + "--" + s.substring(i+2);
                }else{
                    str = s.substring(0, i) + "--";
                }
                res.add(str);
            }
        }
        
        return res;
    }
}