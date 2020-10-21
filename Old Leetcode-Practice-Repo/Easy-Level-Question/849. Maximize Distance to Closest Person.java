class Solution {
    public int maxDistToClosest(int[] seats) {
        //create two arrays, left and right
        int[] left = new int[seats.length];
        int[] right = new int[seats.length];
        Arrays.fill(left, seats.length);
        Arrays.fill(right, seats.length);
        
        for(int i=0; i<seats.length; i++){
            if(seats[i]==1) left[i]=0;
            else if(i>0) left[i] = left[i-1]+1; 
        }
        
        for(int i=seats.length-1; i>=0; i--){
            if(seats[i]==1) right[i]=0;
            else if(i<seats.length-1) right[i] = right[i+1]+1;
        }
        
        int result=0;
        
        for(int i=0; i<seats.length; i++){
            if(seats[i] == 0){
                result=Math.max(result, Math.min(left[i], right[i]));
            }
        }
        
        return result;
    }
}