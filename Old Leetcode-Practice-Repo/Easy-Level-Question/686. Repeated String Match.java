class Solution {
    public int repeatedStringMatch(String A, String B) {
        int counter=0;
        String newStringA = new String();
        while(!repeatedStringMatchHelper(newStringA, B)){
            if(newStringA.length()>=B.length()) break;
            newStringA+=A;
            counter++;
        }
        if(newStringA.contains(B)) return counter;
        else{
            newStringA+=A;
            if(newStringA.contains(B)) return ++counter;
        }
        return -1;
    }
    private boolean repeatedStringMatchHelper(String A, String B){
        if(A.contains(B)){
            return true;
        }
        return false;
    }
}