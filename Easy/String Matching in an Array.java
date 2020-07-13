class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<String>();
        
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i==j) continue;
                if(words[i].indexOf(words[j])>-1){
                    if(!res.contains(words[j])) res.add(words[j]);
                }else if(words[j].indexOf(words[i])>-1){
                    if(!res.contains(words[i])) res.add(words[i]);
                }
            }
        }
        
        return res;
    }
}