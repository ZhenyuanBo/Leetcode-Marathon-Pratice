class Solution {
    public String removeVowels(String S) {
       String s ="";
       for(char ch: S.toCharArray()){
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               continue;
           }else{
               s+=ch;
           }
       }
       return s;
    }
}