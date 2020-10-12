class Logger {
    
    Map<String, List<Integer>> map;
    
    /** Initialize your data structure here. */
    public Logger() {
        map = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message)){
            List<Integer> timestampList = map.get(message);
            int lastTimeStamp = timestampList.get(timestampList.size()-1);
            if(timestamp-lastTimeStamp<10) return false;
            else{
                map.get(message).add(timestamp);
                return true;
            }
        }else{
            List<Integer> timestampList = new ArrayList<>();
            timestampList.add(timestamp);
            map.put(message, timestampList);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */