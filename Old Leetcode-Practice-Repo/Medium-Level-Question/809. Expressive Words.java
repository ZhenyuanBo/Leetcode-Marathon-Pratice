class Solution {
        
    public int expressiveWords(String S, String[] words) {
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<S.length(); i++){
            if(i+1<S.length() && S.charAt(i)==S.charAt(i+1)){
                count++;
            }else{
                sb.append(count);
                count=1;
            }
        }
        int res=0;
        for(String word: words){
            if(correctWord(word, S)){
                if(canStretch(word, sb.toString())){
                    System.out.println(word);
                    res++;
                }
            }
        }
        return res;
    }
    
    public boolean correctWord(String w, String S){
        Set<Character> wset = new HashSet<Character>();
        Set<Character> sset = new HashSet<Character>();
        for(char c: w.toCharArray()){
            wset.add(c);
        }
        for(char c: S.toCharArray()){
            sset.add(c);
        }
        if(wset.size()<sset.size()) return false;
        
        for(Character ch: sset){
            if(!wset.contains(ch)) return false;
        }

        return true;
    }
    
    public boolean canStretch(String word, String ref){
        StringBuilder sb1 = new StringBuilder();
        int count=1;
        for(int i=0; i<word.length(); i++){
            if(i+1<word.length() && word.charAt(i)==word.charAt(i+1)){
                count++;
            }else{
                sb1.append(count);
                count=1;
            }
        }
        String sb1Str= sb1.toString();
        for(int i=0; i<ref.length(); i++){
            int refVal = Character.getNumericValue(ref.charAt(i));
            int currVal = Character.getNumericValue(sb1Str.charAt(i));
            if(refVal<currVal) return false;
            else if(refVal==2 && currVal==1) return false;
            else if(refVal>=3 && currVal>=1) continue;
        }
        return true;
    }
}