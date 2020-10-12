class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<transactions.length; i++){
            String transaction1 = transactions[i];
            if(!checkFirstCon(transaction1)){
                set.add(transaction1);
            }
            for(int j=i+1; j<transactions.length; j++){
                String transaction2 = transactions[j];
                if(!checkSecondCon(transaction1, transaction2)){
                    set.add(transaction1);
                    set.add(transaction2);
                }
            }
        }
        
        return new ArrayList<>(set);
    }
    private boolean checkFirstCon(String transaction1){
        String amount = transaction1.split(",")[2];
        
        if(Integer.valueOf(amount)>1000) return false;
        
        return true;
    }
    private boolean checkSecondCon(String transaction1, String transaction2){
        String[] transaction1arr = transaction1.split(",");
        String[] transaction2arr = transaction2.split(",");
        
        String name1 = transaction1arr[0];
        String name2 = transaction2arr[0];
        
        String city1 = transaction1arr[3];
        String city2 = transaction2arr[3];
        
        int time1 = Integer.valueOf(transaction1arr[1]);
        int time2 = Integer.valueOf(transaction2arr[1]);
        
        
        if(name1.equals(name2) && !city1.equals(city2) && Math.abs(time1-time2)<=60) return false;
        
        return true;
        
    }
}