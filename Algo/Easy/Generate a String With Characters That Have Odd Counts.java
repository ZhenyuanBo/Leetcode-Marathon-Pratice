class Solution {
    public String generateTheString(int n) {
        String s="";
        char ch='a';
        s+=ch;
        n--;
        
        while(n!=0){
            if(n%2!=0){
                ch+=1;
                int count=0;
                for(int i=0; i<n; i++){
                    s+=ch;
                    count++;
                }
                n-=count;
            }else{
                ch+=1;
                s+=ch;
                n--;
            }
        }
        
        return s;
    }
}