class Solution {
    public boolean isHappy(int n) {
        
        int newVal = n;

        //if this number is not a happy number, it will loop indefinitely
        Set<Integer> loopCheck = new HashSet<Integer>();


        while(loopCheck.add(newVal)){

        	int tempVal=0;
            String str = Integer.toString(newVal);
            
            for(char ch: str.toCharArray()){
                tempVal+=(int)(Math.pow(ch-'0',2));
            }
            newVal=tempVal;
            System.out.println(newVal);
            
            if(newVal==1) return true;
        }

        return false;
        
    }
}