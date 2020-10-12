class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        
        for(int i=0; i<startTime.length; i++){
            int start = startTime[i];
            int end = endTime[i];
            if(queryTime>=start && queryTime<=end){
                count++;
            }
        }
        
        return count;
    }
}