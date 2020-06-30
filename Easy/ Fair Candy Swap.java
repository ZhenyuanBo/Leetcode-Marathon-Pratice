class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sum=0, Atotal=0, Btotal=0;
        
        for(int i=0; i<A.length; i++){
            Atotal+=A[i];
        }
        
        for(int j=0; j<B.length; j++){
            Btotal+=B[j];
        }
        
        int target = (Atotal+Btotal)/2;
        
        int[] res = new int[2];
        
        for(int i: A){
            for(int j: B){
                int Asum = Atotal-i;
                int Bsum = Btotal-j;
                if(Asum+j == target && Bsum+i == target){
                    res[0] = i; 
                    res[1] = j;
                }
            }
        }
        
        return res;
        
        
    }
}

//solution:

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        /*
          X is the value from Array A
          
          Y is the value from Array B
          
          sumA - sum of values in Array A
          
          sumB - sum of values in Array B
          
          We need to find X and Y values that satisfy below conditions
          
          sumA + Y - X  ==  sumB + X - Y
          
          sumA + 2Y - sumB = 2X 
          
          X = (sumA - sumB + 2Y)/2
          
          populate all the values of Array A in a set
          
          loop through all the values of array B and calculate below formalu and check if the result exists in Array A
        
        */
        
        Set<Integer> set = new HashSet<>();
        
        int sumA = 0;
        
        int sumB = 0;
        
        for (int i : A)
        {
            sumA = sumA + i;
            
            set.add(i);
        }
        
         for (int i : B)
        {
            sumB = sumB + i;
            
        }
        
        for(int j: B)
        {
            int temp = (sumA - sumB + 2*j) / 2;
            if(set.contains(temp))
            {
                return new int[]{temp,j};
                   
               }
     
        }
        
        return new int[]{0,0};
        
    }
}