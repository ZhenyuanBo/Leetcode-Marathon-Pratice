class Solution {
    public void reverseWords(char[] s) {
        int left=0, right=s.length-1;
        
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        
        int i=0, j=0;
        
        while(i<s.length){
            if((j+1<s.length && s[j+1]==' ') || (j+1 == s.length)){
                int e=j;
                while(i<e){
                    char temp = s[i];
                    s[i] = s[e];
                    s[e] = temp;
                    i++;
                    e--;
                }
                j+=2;
                i = j;
            }else{
                j++;
            }
        }
    }
}