class Solution {
    Map<Integer, Integer>  idxToVal = new HashMap(){{
		put(0,1); 
		put(1,2);
		put(2,4); 
		put(3,8); 
		put(4,1); 
		put(5,2); 
		put(6,4); 
		put(7,8); 
		put(8,16);
		put(9,32);
	}};
    
    public List<String> readBinaryWatch(int num) {
       List<String> result = new ArrayList();
       int[] used = new int[10];
       helper(num, used, result, 0);
       Collections.sort(result);
       return result; 
    }
    private void helper(int num , int[] used,  List<String> result, int start) {
        if(num == 0 ) {
            String time = getTime(used);
            if(time != null)
                result.add(time);
            return;
        }
		//using backtracking to create all possibilities
        for(int i=start; i<used.length; i++){
            if(used[i]==0){
                used[i]=1;    
                helper(num-1, used, result, i+1);
                used[i]=0;
            }    
        }
    }
    private String getTime(int[] used) {
       int hour=0, mins=0;
       for(int i=0; i< used.length; i++){
            if(used[i]==1){
                if(i<=3){
                    hour  += idxToVal.get(i);
                } else {
                    mins += idxToVal.get(i);
                }
            }    
            
       }
       if(hour>=12 || mins>=60)
         return null;
        
       StringBuilder timeStr = new StringBuilder(hour+":");
       if(mins<=9)
            timeStr.append("0");
       timeStr.append(mins);
       return timeStr.toString(); 
    }
}