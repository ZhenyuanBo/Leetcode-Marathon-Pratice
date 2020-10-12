class LogSystem {
    
    Map<Integer, String> logStorageMap;
    String[] graArray;
    
    public LogSystem() {
        logStorageMap = new HashMap<>();  
        graArray = new String[]{"Year", "Month", "Day", "Hour", "Minute", "Second"};
    }
    
    public void put(int id, String timestamp) {
        logStorageMap.put(id, timestamp);
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {

        List<Integer> res = new ArrayList<>();
        
        int graIndex = 0;
        
        for(int i=0; i<graArray.length; i++){
            if(graArray[i].equals(gra)){
                graIndex = i;
                break;
            }
        }
        
        String[] sArr = s.split(":");
        String[] eArr = e.split(":");
        
        for(Integer Key: logStorageMap.keySet()){
            String timeStamp = logStorageMap.get(Key);
            String[] timeStampArr = timeStamp.split(":");
            
            boolean leftHasError = false, rightHasError = false;
            
            //check left bound
            for(int i=0; i<=graIndex; i++){
                if(Integer.valueOf(timeStampArr[i])>Integer.valueOf(sArr[i])){
                    break;
                }else if(Integer.valueOf(timeStampArr[i])<Integer.valueOf(sArr[i])){
                    leftHasError = true;
                    break;
                }
            }

            if(leftHasError) continue;
            
            //check right bound
            for(int i=0; i<=graIndex; i++){
                if(Integer.valueOf(timeStampArr[i])<Integer.valueOf(eArr[i])){
                    break;
                }else if(Integer.valueOf(timeStampArr[i])>Integer.valueOf(eArr[i])){
                    rightHasError = true;
                    break;
                }
            }
            
            if(!rightHasError){
                res.add(Key);
            }
        }
        
        return res;
        
    }
    
    
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */