class Solution {
    public String breakPalindrome(String palindrome) {
        /*
        if string is even length, then if one letter is not a replace with a
        if string is odd length and the letter is not at the middle, replace that letter with a
        if string only has one character, return empty string
        otherwise, replace last character with 'b'
        */
        if(palindrome.length()==1) return "";
        
        char[] arr = palindrome.toCharArray();
        String res="";
        
        boolean flag = false;
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!='a'){
                //if length is even
                if(arr.length % 2 == 0){
                    arr[i] = 'a';
                    flag = true;
                    break;
                }else if(arr.length % 2 !=0 && i!=arr.length/2){
                    arr[i] = 'a';
                    flag = true;
                    break;
                }
            }
        }
        
        if(!flag) return palindrome.substring(0, palindrome.length()-1) + 'b';
        
        for(char ch: arr){
            res+=ch;
        }
        
        return res;
    }
}