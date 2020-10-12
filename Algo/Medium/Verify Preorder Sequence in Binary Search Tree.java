class Solution {
    public boolean verifyPreorder(int[] A) {
        //if current value is less than the max value, then it is false
        if(A.length==0) return true;
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        st.push(A[0]);
        for(int i=1; i<A.length; i++){
            if(A[i]<max) return false;
            if(A[i]<st.peek()){
                st.push(A[i]);
            }else{
                while(!st.isEmpty() && A[i]>st.peek()){
                    max = Math.max(max, st.pop());
                }
                st.push(A[i]);
            }
        }
        return true;
    }
}
