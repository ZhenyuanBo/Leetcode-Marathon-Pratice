class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        char[] nameModified = stringProcess(name).toCharArray();
        char[] typedModified = stringProcess(typed).toCharArray();
        
        if(typedModified.length != nameModified.length) return false;
        
        int i=0;
        for(char ch: typedModified){
            int typeVal = Character.getNumericValue(ch);
            int nameVal = Character.getNumericValue(nameModified[i]);
            if(typeVal<nameVal) return false;
            i++;
        }
        
        return true;
        
    }
    
    private String stringProcess(String str){
        int i=0;
        int j=0;
        String str1 = new String();
        while(i<str.length()){  
            int count=1;
            for(j=i+1; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }else{
                    i=j;
                    str1+=count;
                    break;
                }
            }
            if(j==str.length()){
                str1+=count;
                break;
            }
        }
        System.out.println(str1);
        return str1;
    }
}