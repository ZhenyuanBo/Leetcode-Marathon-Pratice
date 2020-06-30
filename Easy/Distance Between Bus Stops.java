class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination){
        //clockwise direction
        int disClockwise = 0;
        
        //counter-clockwise direction
        int disCounterclockwise=0;
        
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        
        for(int i=start; i<destination; i++){
            disClockwise += distance[i];
        }
        
        System.out.println(start);
        System.out.println(destination);
        System.out.println(disClockwise);
        
        for(int i=start-1; i>=0; i--){
            disCounterclockwise+=distance[i];
        }
        
        for(int i=distance.length-1; i>=destination; i--){
            disCounterclockwise+=distance[i];
        }
        
        return Math.min(disClockwise, disCounterclockwise);
        
        
    }
}