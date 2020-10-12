class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int prev=0;
        
        for(int i=A.length-1; i>=0; i--){
            int val = A[i];
            int remainder = K%10;
            int sum = prev + val + remainder;
            if(sum>=10){
                A[i] = sum % 10;
                prev = sum/10;
            }else{
                A[i] = sum;
                prev=0;
            }
            K = K/10;
        }
        
        List<Integer> list =  new ArrayList<Integer>();
        
        if(K!=0 || prev>0){
            K = K+prev;
            String str = Integer.toString(K);
            for(char ch: str.toCharArray()){
                list.add(Character.getNumericValue(ch));
            }
        }
        
        for(int i=0; i<A.length; i++){
            list.add(A[i]);
        }
        
        return list;
        
    }
}