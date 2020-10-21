class Solution {
    public String[] findWords(String[] words) {
        
        List<Character> firstRowList = Arrays.asList('Q','W','E','R','T','Y','U','I','O','P');
        List<Character> secondRowList = Arrays.asList('A','S','D','F','G','H','J','K','L');
        List<Character> thirdRowList = Arrays.asList('Z','X','C','V','B','N','M');
        
        int rowNum = 0;

        List<String> strList = new ArrayList<String>();
        
        for(String word : words){

            int sum = 0;
            
            char firstChar = Character.toUpperCase(word.charAt(0));
            
            if(firstRowList.contains(firstChar)){
                rowNum = 1;
            }else if(secondRowList.contains(firstChar)){
                rowNum = 2;
                
            }else{
                rowNum = 3;
            }
            
            
            if(rowNum == 1){
                sum = word.length() * 1;
                
                for(Character ch: word.toUpperCase().toCharArray()){
                    if(firstRowList.contains(ch)){
                        sum--;
                    }
                }
                
            }else if(rowNum == 2){
                sum = word.length() * 2;
                
                for(Character ch: word.toUpperCase().toCharArray()){
                    if(secondRowList.contains(ch)){
                        sum -=2;
                    }
                }
                
            }else{
                sum = word.length() * 3;
                
                for(Character ch: word.toUpperCase().toCharArray()){
                    if(thirdRowList.contains(ch)){
                        sum -=3;
                    }
                }
                
            }

            if(sum == 0) strList.add(word);
        }
        
        String[] ans = new String[strList.size()];
        
        ans = strList.toArray(ans);
        
        return ans;
        
    }
}