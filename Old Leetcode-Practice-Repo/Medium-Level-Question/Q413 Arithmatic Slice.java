class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int counter=0;
		int diff=0;
        for(int i=0;i<A.length; i++){
            int k=i+1;
            int j=i+2;
			if(k<A.length) diff = A[i]-A[k];
            boolean isArithmatic = true;
            while(j<A.length){
                if(diff!=(A[k]-A[k+1])){
					isArithmatic = false;
					break;
				}
                if(k+1==j){
                    k=i+1;
                    j++;
                    counter++;
                }else{
                    k++;
                }
            }
        }
        return counter;
    }
}