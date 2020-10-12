class Solution {
    public double angleClock(int hour, int minutes) {
        
        double minAngle = ((double)minutes/5) * 30;
        
        int hourNum = hour==12 ? 0 : hour;
        int hourAngle = hourNum * 30;
        
        double pastMinAngle = ((double)(minutes)/60) * 30;
        
        double angle = Math.abs((double)hourAngle + pastMinAngle - minAngle);
        
        double compAngle = 360-angle;
        
        return Math.min(angle, compAngle);
       
    }
}