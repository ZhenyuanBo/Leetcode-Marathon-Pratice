class Solution {
    public int minAddToMakeValid(String S) {
        
        Stack<Character> s = new Stack();
        
        for(int i=0; i<S.length(); i++){
            if(!s.isEmpty() && s.peek()=='(' && S.charAt(i)==')'){
                s.pop();
            }else{
                s.push(S.charAt(i));
            }
        }
        
        int minNum=0;
        
        while(!s.isEmpty()){
            s.pop();
            minNum++;
        }
        
        return minNum;
    }
}