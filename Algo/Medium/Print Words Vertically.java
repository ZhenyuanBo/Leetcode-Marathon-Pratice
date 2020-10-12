class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        
        String[] wordsList = s.split("\\s+");
        
        int maxLen = Integer.MIN_VALUE;
        
        for(String word: wordsList){
            maxLen = Math.max(maxLen, word.length());
        }
        
        int i=0;
        
        while(i<maxLen){
            StringBuilder sb = new StringBuilder();
            System.out.println(i);
            for(String word: wordsList){
                if(i>=word.length()){
                    sb.append(" ");
                }else{
                    sb.append(word.charAt(i));
                }
            }
            String newStr = removeTrailingSpace(sb.toString());
            list.add(newStr);
            i++;
        }
        
        return list;
    }
    private String removeTrailingSpace(String str){
        int index=str.length()-1;
        
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==' '){
                index--;
            }else{
                break;
            }
        }
        return str.substring(0, index+1);
    }
}