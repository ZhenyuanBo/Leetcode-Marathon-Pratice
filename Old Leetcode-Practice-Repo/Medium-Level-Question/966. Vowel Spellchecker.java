class Solution {
    
    private Set<String> setPerfect = new HashSet<String>();
    private Map<String, String> mapCap = new HashMap<String, String>();
    private Map<String, String> mapVowel = new HashMap<String, String>();
    
    public String[] spellchecker(String[] wordlist, String[] queries) {
        /*
        1. create a set to check if the set contains the query word
        2. create a hashmap to return the result when query matches a word up to capitalization
        3. 
        */
        
        for(String word: wordlist){
            setPerfect.add(word);
            
            String wordLow = word.toLowerCase();
            mapCap.putIfAbsent(wordLow, word);
            
            String wordWithoutVowel = deVowel(wordLow);
            mapVowel.putIfAbsent(wordWithoutVowel, word);
        }
        
        String[] res = new String[queries.length];
        int i=0;
        for(String query: queries){
            res[i] = wordFinder(query);
            i++;
        }
        return res;
    }
    public String deVowel(String word){
        StringBuilder sb = new StringBuilder();
        for(char ch: word.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                sb.append('*');
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public String wordFinder(String query){
        if(setPerfect.contains(query)) return query;
        
        String queryLow = query.toLowerCase();
        
        if(mapCap.keySet().contains(queryLow)) return mapCap.get(queryLow);
        
        String queryLowWithoutVowel = deVowel(queryLow);
        System.out.println(queryLowWithoutVowel);
        
        if(mapVowel.keySet().contains(queryLowWithoutVowel)) return mapVowel.get(queryLowWithoutVowel);
        
        return "";
    }
}