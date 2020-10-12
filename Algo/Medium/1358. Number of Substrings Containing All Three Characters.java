class Solution {
    public int numberOfSubstrings(String s) {
        int[] abcArr = new int[3];
        int slowPointer=0, fastPointer=0, count=0;
        
        for(int i=fastPointer; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                abcArr[0]++;
            }else if(s.charAt(i)=='b'){
                abcArr[1]++;
            }else if(s.charAt(i)=='c'){
                abcArr[2]++;
            }
            
            while(abcArr[0]>0 && abcArr[1]>0 && abcArr[2]>0){
                count+=s.length()-i;
                if(s.charAt(slowPointer)=='a'){
                    abcArr[0]--;
                }else if(s.charAt(slowPointer)=='b'){
                    abcArr[1]--;
                }else if(s.charAt(slowPointer)=='c'){
                    abcArr[2]--;
                }
                slowPointer++;
            }
        }
        
        return count;
    }
}