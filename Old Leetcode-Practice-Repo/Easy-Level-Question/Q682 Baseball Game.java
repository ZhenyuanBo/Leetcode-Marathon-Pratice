class Solution {
    public int calPoints(String[] ops) {
        
        List<String> newOpsList = new ArrayList<String>();
        
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                newOpsList.remove(newOpsList.size()-1);
            }else{
                newOpsList.add(ops[i]);
            }
        }
        
        int sum=0;
        int currVal =0;
        
        for(int i=0; i<newOpsList.size(); i++){
            
            if((newOpsList.get(i).equals("D") || newOpsList.get(i).equals("+")) && i==0) return 0;
            
            if(newOpsList.get(i).equals("D")){
                currVal = Integer.parseInt(newOpsList.get(i-1)) * 2;
                newOpsList.set(i, Integer.toString(currVal));
                sum = sum + currVal;
            }else if(newOpsList.get(i).equals("+")){
                currVal = Integer.parseInt(newOpsList.get(i-1)) + Integer.parseInt(newOpsList.get(i-2));
                newOpsList.set(i, Integer.toString(currVal));
                sum = sum + currVal;
            }else{
                currVal = Integer.parseInt(newOpsList.get(i));
                sum = sum + currVal;
            }
        }
        
        return sum;
        
        
    }
}