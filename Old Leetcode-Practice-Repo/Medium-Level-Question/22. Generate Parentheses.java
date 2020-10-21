/*
use brute force method to generate all possible collections (use recursion)
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateValidParenthesis(new char[n*2], 0, list);
        return list;
    }
    public void generateValidParenthesis(char[] sol, int pos, List<String> combination){
        if(pos == sol.length){
            if(checkValidParenthesis(sol)){
                //convert char[] array to string
                combination.add(new String(sol));
            }
        }else{
            sol[pos]='(';
            generateValidParenthesis(sol, pos+1, combination);
            sol[pos]=')';
            generateValidParenthesis(sol, pos+1, combination);
        }
    }
    
    public boolean checkValidParenthesis(char[] solArr){
        int count=0;
        for(char ch: solArr){
            if(ch == '(') count++;
            else{
                count--;
            }
            if(count<0) return false;
        }
        return count==0;
    }
}