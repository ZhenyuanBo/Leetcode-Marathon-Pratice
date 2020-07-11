class Solution {
    public String freqAlphabets(String s) {
      String res="";
      char ch='j';
      char startCh = 'a';
        
      for(int i=0; i<s.length();){
          if(i+2<s.length() && s.charAt(i+2)=='#'){
              String str = s.substring(i, i+2);
              int strVal = Integer.parseInt(str);
              int diff = strVal - 10;
              int val = (int)ch + diff;
              System.out.println((char)val);
              res+=(char)val;
              i+=3;
          }else{
              char currch = s.charAt(i);
              int val = (int)startCh + Character.getNumericValue(currch)-1;
              res+=(char)val;
              i+=1;
          }
      }
        
      return res;
    }
}