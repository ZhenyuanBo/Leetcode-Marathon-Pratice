class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> resList = new ArrayList<>();
        for(String query: queries){
            resList.add(isMatch(query, pattern));
        }
        return resList;
    }
    private Boolean isMatch(String query, String pattern){
        int j=0;
        
        for(int i=0; i<query.length();){
            if(j<pattern.length()){
                if(query.charAt(i)==pattern.charAt(j)){
                    i++;
                    j++;
                }else if(query.charAt(i)>='a' && query.charAt(i)<='z'){
                    i++;
                }else{
                    return false;
                }
            }else{
                if(query.charAt(i)>='a' && query.charAt(i)<='z'){
                    i++;
                }else{
                    return false;
                }
            }
        }
        
        if(j==pattern.length()) return true;
        
        return false;
    }
}