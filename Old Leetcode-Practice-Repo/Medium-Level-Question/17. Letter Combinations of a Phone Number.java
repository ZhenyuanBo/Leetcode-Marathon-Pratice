class Solution {
    public List<String> letterCombinations(String digits) {
        
        //using FIFO queue idea to implement, using LinkedList to implement queue
        LinkedList<String> queue = new LinkedList<String>();
        
        if(digits.length()==0) return queue;
        
        String[] intStrMap = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        queue.add("");
        
        for(int i=0; i<digits.length(); i++){
            int num = Character.getNumericValue(digits.charAt(i));
            String str = intStrMap[num];
            int queueSize = queue.size();
            while(queueSize>0){
                String top = queue.poll();
                for(char ch: str.toCharArray()){
                    queue.add(top + ch);
                }
                queueSize--;
            }
        }
        
        return queue;
        
    }
}