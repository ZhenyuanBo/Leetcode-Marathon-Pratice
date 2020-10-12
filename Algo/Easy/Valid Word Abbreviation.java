class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex=0, i;
        
        for(i=0; i<abbr.length();){
            if(Character.isLetter(abbr.charAt(i))){
                if(wordIndex>=word.length()) return false;
                if(abbr.charAt(i) != word.charAt(wordIndex)) return false;
                i++;
                wordIndex++;
            }else if(Character.isDigit(abbr.charAt(i))){
                String val = ""+abbr.charAt(i);
                if(val.equals("0")) return false;
                while(++i < abbr.length() && Character.isDigit(abbr.charAt(i))){
                    val += abbr.charAt(i);
                }
                int nextIndex = Integer.parseInt(val);
                if(nextIndex>word.length()-wordIndex) return false;
                wordIndex = wordIndex + nextIndex;
            }
        }
        
        if(wordIndex<word.length() && i==abbr.length()) return false;
        
        return true;
    }
}