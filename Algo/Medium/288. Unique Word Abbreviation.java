class ValidWordAbbr {
    private Map<String, Set<String>> map = new HashMap<>();
    
    public ValidWordAbbr(String[] dictionary) {
        for(String str: dictionary){
            toAbbr(str);
        }
    }
    
    public boolean isUnique(String word) {
        if(word.length()<=2){
            if(map.containsKey(word)){
                if(!map.get(word).contains(word)) return false;
                else if(map.get(word).size()==1 && map.get(word).contains(word)) return true;
                else
                    return false;
            }
            else
                return true;
        }else{
            String abbrWord = word.charAt(0) + Integer.toString((word.length()-2)) + word.charAt(word.length()-1);
            if(map.containsKey(abbrWord)){
                if(!map.get(abbrWord).contains(word)) return false;
                else if(map.get(abbrWord).size()==1 && map.get(abbrWord).contains(word)) return true;
                else
                    return false;
            }
            else
                return true;
        }
        
    }
    
    private void toAbbr(String str){
        if(str.length()<=2){
            if(map.containsKey(str)){
                map.get(str).add(str);
            }else{
                Set<String> set = new HashSet<>();
                set.add(str);
                map.put(str, set);
            }
        }else{
            String abbrStr = str.charAt(0) + Integer.toString((str.length()-2)) + str.charAt(str.length()-1);
            if(map.containsKey(abbrStr)){
                map.get(abbrStr).add(str);
            }else{
                Set<String> set = new HashSet<>();
                set.add(str);
                map.put(abbrStr, set);
            }
        }
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */