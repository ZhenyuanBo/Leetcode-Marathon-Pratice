class Solution {
    public String customSortString(String S, String T) {
        List<Character> tList = new ArrayList<Character>();
        for(Character ch: T.toCharArray()){
            tList.add(ch);
        }
        
        Map<Character, Integer> charNumOccur = new HashMap<Character, Integer>();
        StringBuilder res = new StringBuilder();
        
        for(char ch: T.toCharArray()){
            int numOccur = charNumOccur.getOrDefault(ch, 0)+1;
            charNumOccur.put(ch, numOccur);
        }
        
        for(char ch: S.toCharArray()){
            int num=0;
            if(charNumOccur.containsKey(ch)){
                num = charNumOccur.get(ch);
            }
            while(num>0){
                res.append(ch);
                tList.remove(tList.indexOf(ch));
                num--;
            }
        }
        
        for(Character ch: tList){
            res.append(ch);
        }
        
        return res.toString();
        
        
    }
}