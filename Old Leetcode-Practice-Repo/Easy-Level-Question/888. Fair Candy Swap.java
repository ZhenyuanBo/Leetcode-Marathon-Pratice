class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0;
        int sumB=0;
        for(int i:A){
            sumA+=i;
        }
        for(int j:B){
            sumB+=j;
        }
        int delta = (sumB-sumA)/2;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int k:B){
            set.add(k);
        }
        
        int[] result = new int[2];
        
        for(int L:A){
            if(set.contains(L+delta)){
                result[0] = L;
                result[1] = L+delta;
            }
        }
        
        return result; 
    }
}