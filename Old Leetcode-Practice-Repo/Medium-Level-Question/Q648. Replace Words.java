class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        Map<String, String> replaceMap = new HashMap<String, String>();
        int minLen = 0;
        
        for(String str: dict){
            int begin=0;
            for(String word: words){
                if(word.contains(str)){
                    int len = str.length();
                    String substr = word.substring(0,len);
                    if(substr.equals(str)){
                        if(replaceMap.get(word) == null){
                            replaceMap.put(word, str);
                            minLen=str.length();
                        }
                        else{
                            if(minLen>str.length()){
                                replaceMap.put(word, str);
                            } 
                        }
                    }
                }
            }
        }
        
        for(String word: words){
            if(replaceMap.keySet().contains(word)){
                sb.append(replaceMap.get(word)).append(" ");
            }else{
                sb.append(word).append(" ");
            }
        }
        
        return sb.toString().trim();
    }
}