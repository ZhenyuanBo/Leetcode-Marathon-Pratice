class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

    	List<Integer> ans = new ArrayList<Integer>();

        while(left<=right){
        	if(numberCheck(left)) ans.add(left);
        	left++;
        }

        return ans;
    }
    private boolean numberCheck(int num){
        int targetVal = num;
    	while(num!=0){
    		int remainder = num % 10;
            
    		if(remainder==0 || (targetVal % remainder)!=0) return false;
            
    		num = num/10;
    	}
    	return true;
    }
}