class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codeList = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.", "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> res = new HashSet<String>();
        
        for(String word: words){
            StringBuilder sb = new StringBuilder();
            for(char ch: word.toCharArray()){
                int indx = ch-'a';
                sb.append(codeList[indx]);
            }
            System.out.println(sb.toString());
            res.add(sb.toString()); 
        }
        
        return res.size();
    }
}