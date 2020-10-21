class Solution {
    public String longestWord(String[] words) {
        
        Arrays.sort(words);
    	Set<String> wordsList = new HashSet<String>();
        String res="";
        
    	for(String str: words){
            int endIndex=str.length()-1;
            
            if(str.length()==1 || wordsList.contains(str.substring(0, endIndex))){
                res = str.length() > res.length() ? str: res;
                wordsList.add(str);
            }
        }
        
        return res;
    }
}