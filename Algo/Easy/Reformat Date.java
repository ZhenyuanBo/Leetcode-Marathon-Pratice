class Solution {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] dateComp = date.split("\\s+");
        
        String dateVal = dateComp[0];
        if(dateVal.indexOf("rd")>-1){
            dateVal = dateVal.substring(0, dateVal.indexOf("rd"));
        }else if(dateVal.indexOf("st")>-1){
            dateVal = dateVal.substring(0, dateVal.indexOf("st"));
        }else if(dateVal.indexOf("th")>-1){
            dateVal = dateVal.substring(0, dateVal.indexOf("th"));
        }else if(dateVal.indexOf("nd")>-1){
            dateVal = dateVal.substring(0, dateVal.indexOf("nd"));
        }
        
        if(dateVal.length()==1){
            dateVal = "0" + dateVal;
        }
        
        int monthIndex = 0;
        
        for(int i=0; i<months.length; i++){
            if(months[i].equals(dateComp[1])){
                monthIndex = i+1;
                break;
            }
        }
        
        String monthVal = "";
        
        if(monthIndex<10){
            monthVal = "0" + monthIndex;
        }else{
            monthVal += monthIndex;
        }
        
        return dateComp[2] + '-' + monthVal + "-" + dateVal;
    }
}