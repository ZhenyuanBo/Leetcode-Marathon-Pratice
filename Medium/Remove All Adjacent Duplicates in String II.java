
//store counts
//use sb.delete() method
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<sb.length(); i++){
            if(i==0 || sb.charAt(i)!=sb.charAt(i-1)){
                st.push(1);
            }else{
                int currCount = st.pop()+1;
                if(currCount==k){
                    sb.delete(i-k+1, i+1);
                    i=i-k;
                }else{
                    st.push(currCount);
                }
            }
        }
        return sb.toString();
    }
}