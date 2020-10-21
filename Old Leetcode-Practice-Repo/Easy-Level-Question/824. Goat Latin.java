class Solution {
    public String toGoatLatin(String S) {
        String newStr = new String();
        String[] sArr = S.split("\\s+");
        
        int i=1;
        
        for(String str: sArr){
            newStr+=newStrGenerator(str, i)+" ";
            i++;
        }
        
        newStr = newStr.trim();
        
        return newStr;
    }
    private String newStrGenerator(String str1, int index){
        String vowelStr = "aeiou";
        char firstCh = str1.toLowerCase().charAt(0);
        String str2 = new String();
        
        if(vowelStr.indexOf(firstCh)>-1){
            str2 = str1+"ma"; 
        }else{
            str2 = str1.substring(1) + str1.charAt(0) + "ma";
        }
        
        while(index>0){
            str2+='a';
            index--;
        }
        
        return str2;
        
    }
}