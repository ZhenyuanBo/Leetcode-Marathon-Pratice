class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int remainder=0;
        List<Boolean> list = new ArrayList<Boolean>();
        
        for(int i=0; i<A.length; i++){
            remainder = (remainder * 2 + A[i]) % 5; 
            if(remainder == 0) list.add(true);
            else list.add(false);
        }
        
        return list;
    }
    //https://www.geeksforgeeks.org/check-divisibility-binary-stream/
    //divisibility of binary stream by a specific number

}