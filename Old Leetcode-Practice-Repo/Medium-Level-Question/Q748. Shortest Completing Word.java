class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character ch: licensePlate.toCharArray()){
            if(Character.isLetter(ch)){map.put(ch, (map.getOrDefault(ch, 0)+1));}
        }
        
        String res = new String();
        List<String> resList = new ArrayList<String>();
        
        int minStrLen=Integer.MAX_VALUE;
        
        for(String word: words){
            boolean found = true;
            Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
            for(Character ch: word.toCharArray()){wordMap.put(ch, (wordMap.getOrDefault(ch,0)+1));}
            for(Character ch: map.keySet()){
                if(wordMap.keySet().contains(ch)){
                    if(wordMap.get(ch)<map.get(ch)){
                        found = false;
                        break;
                    }
                }else{
                    found = false;
                    break;
                }
            }
            if(found){
                resList.add(word);
                minStrLen = Math.min(minStrLen, word.length());
            }
        }
        
        for(String word: resList){
            if(word.length() == minStrLen){
                res = word;
                break;
            }
        }
        
        return res;
    }
}