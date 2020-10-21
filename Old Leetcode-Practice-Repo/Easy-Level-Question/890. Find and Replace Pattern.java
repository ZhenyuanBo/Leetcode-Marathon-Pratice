class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<String>();
        
        for(String word: words){
            if(checkString(word, pattern)){
                list.add(word);
            }
        }
        
        return list;
    }
    private boolean checkString(String word, String pattern){
        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();
        
        for(char ch: pattern.toCharArray()){
            map.put(ch, '\u0000');
        }

        int i=0;
        for(char key: pattern.toCharArray()){
            if(map.get(key) == '\u0000'){
                if(set.add(word.charAt(i))) map.put(key, word.charAt(i));
                else return false;
            }else if(map.get(key) != '\u0000'){
                if(map.get(key) != word.charAt(i)) return false;
            }
            i++;
        }
        return true;
    }
}