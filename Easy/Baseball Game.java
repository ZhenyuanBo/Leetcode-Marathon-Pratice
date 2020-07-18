class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack();
        
        for(String str: ops){
            if(str.equals("+")){
                int lastRound = score.pop();
                int secLastRound = score.pop();
                int currRound = lastRound + secLastRound;
                score.push(secLastRound);
                score.push(lastRound);
                score.push(currRound);
            }else if(str.equals("D")){
                int lastRound = score.peek();
                int currRound = lastRound * 2;
                score.push(currRound);
            }else if(str.equals("C")){
                score.pop();
            }else{
                score.push(Integer.parseInt(str));
            }
        }
        
        int total=0;
        
        while(!score.isEmpty()){
            total += score.pop();
        }
        
        return total;
    }
}