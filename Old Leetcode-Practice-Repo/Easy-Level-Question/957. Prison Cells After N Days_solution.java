public int[] prisonAfterNDays(int[] cells, int N) {
        
        int counter = 1; // use counter to record the number of the day, counter = 1 means day1
        int day1 = -1, day2 = -1;
        Map<Integer, String> map = new HashMap<Integer, String>(); // convert the int array to String, compare the string, find the loop
        String s = "";
        for(int i = 0; i < cells.length; i++){
            s = s + cells[i];
        }
        map.put(0, s); //this is the String for the day 0
        
        while(true){
            StringBuilder sb = new StringBuilder();
            sb.append('0'); // the first number is 0
            for(int i = 1; i <= cells.length-2; i++){
                if(cells[i-1] == cells[i+1]){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                }
            }
            sb.append(0); //the last number is zero
            
            String str = sb.toString(); //convert the int array to string
             for(int i = 0; i < cells.length; i++){
                  cells[i] = str.charAt(i) - '0'; // renew the cells array for different dates
             }
        
            if(!map.containsValue(str)){
                map.put(counter, str);
            }
            else{ // there are same Strings, this means we find a loop
                for(Map.Entry<Integer, String> entry: map.entrySet()){
                    if(entry.getValue().equals(str)){
                        day1 = entry.getKey(); // day1 is the begain day of the first loop day
                        break;
                    }
                }
                day2 = counter; //day2 is the begain day of the second loop day
                break;
            }
            counter++;
            
        }
  
        int n = day2-day1;
		//Because the first day of the loop(day1) may not begin from day 0, so (N-day1)%n + day1
        counter = (N-day1)%n + day1; // Nth day has the same pattern as the counter
        int[] a = new int[cells.length];
        for(int i = 0; i < cells.length; i++){
            a[i] = map.get(counter).charAt(i) - '0';
        }
        return a;
    }