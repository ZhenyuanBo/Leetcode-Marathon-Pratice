class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int[] arr = new int[A.length];
        Stack<Integer> oddIndices = new Stack<Integer>();
        Stack<Integer> evenIndices = new Stack<Integer>();
        
        for(int i=0; i<A.length; i++){
            if(i%2==0){
                evenIndices.push(i);
            }else{
                oddIndices.push(i);
            }
        }
        
        for(int i=0; i<A.length; i++){
            int index=0;
            if(A[i]%2==0){
                index = evenIndices.pop();
            }else{
                index = oddIndices.pop();
            }
            arr[index] = A[i];
        }
        
        return arr;
        
    }
}