class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        String firstWord = words[0];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i), i);
        }
        
        String wordPos = stringPos(firstWord, map);
        
        for(int i=1; i<words.length;i++){
            String wordPos1 = stringPos(words[i], map);
            if(!stringCompare(wordPos, wordPos1)) return false;
            wordPos = wordPos1;
        }
        
        return true;
    }
    public String stringPos(String str1, Map<Character, Integer> map){
        String s = "";
        for(char ch: str1.toCharArray()){
            s+=map.get(ch)+" ";
        }
        return s.trim();
    }
    public boolean stringCompare(String str2, String str3){
        System.out.println(str2);
        System.out.println(str3);
        
        String[] str2Arr = str2.split("\\s+");
        String[] str3Arr = str3.split("\\s+");

        int n=0;
        int m=0;
        boolean isSorted=true;
        
        for(int i=0; i<str2Arr.length; i++){
            n = Integer.parseInt(str2Arr[i]);
            if(i<str3Arr.length){
                m = Integer.parseInt(str3Arr[i]);
            }else{
                return false;
            }
            
            if(n>m){
               isSorted=false; 
                break;
            }else if(n==m){
                continue;
            }else{
                break;
            }
        }
        return isSorted;
    }
}