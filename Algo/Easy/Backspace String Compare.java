class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack();
        Stack<Character> stackT = new Stack();
        
        for(int i=0; i<S.length(); i++){
            if(!stackS.isEmpty() && S.charAt(i)=='#'){
                stackS.pop();
            }else{
                if(S.charAt(i)!='#')  stackS.push(S.charAt(i));
            }
        }
        
        for(int j=0; j<T.length(); j++){
            if(!stackT.isEmpty() && T.charAt(j)=='#'){
                stackT.pop();
            }else{
                if(T.charAt(j)!='#') stackT.push(T.charAt(j));
            }
        }
        
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();
        
        while(!stackS.isEmpty()){
            sbS.insert(0, stackS.pop());
        }
        
        while(!stackT.isEmpty()){
            sbT.insert(0, stackT.pop());
        }
        
        return sbS.toString().equals(sbT.toString());
    }
}