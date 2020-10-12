class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] monthArr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        //1971-1-1 is Friday
        int numDays=4;
        for(int i=1971; i<year; i++){
            if((i%4==0 && i%100!=0) || i%400==0){
                numDays+=366;
            }else{
                numDays+=365;
            }
        }
        
        for(int i=0; i<month-1; i++){
            numDays+=monthArr[i];
        }
        
        if(month>2){
            if((year%4==0 && year%100!=0) || year%400==0){
                numDays++;
            }
        }
        
        numDays = numDays+day;
        
        return days[numDays%7];
    }
}