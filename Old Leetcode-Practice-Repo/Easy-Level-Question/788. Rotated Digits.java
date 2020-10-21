class Solution {
    public int rotatedDigits(int N) {
        int count=0;
        for(int i=N; i>=0; i--){
            if(checkNumber(i)) count++;
        }
        return count;
    }
    private boolean checkNumber(int num){
        
        Set<Integer> good = new HashSet<Integer>(Arrays.asList(2,5,6,9));
        Set<Integer> bad = new HashSet<Integer>(Arrays.asList(3,4,7));
        
        String numStr = String.valueOf(num);
        boolean goodVal = false;
        for(char ch: numStr.toCharArray()){
            int numCh = Character.getNumericValue(ch);
            if(bad.contains(numCh)){
                goodVal=false;
                break;
            }else if(good.contains(numCh)){
                goodVal = true;
            }
        }
        
        
        if(goodVal){
            System.out.println(num);
            return true;
        }
        
        return false;

    }
}
/*
can use % to retrieve each digit
*/