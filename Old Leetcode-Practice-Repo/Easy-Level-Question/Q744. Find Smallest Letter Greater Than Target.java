class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

    	char ans = ' ';

    	for(int i=0; i<letters.length; i++){
    		if(letters[i] > target){
    			ans = letters[i];
    			break;
    		}else if(letters[i] <= target && i == letters.length-1){
    			ans = letters[0];
    			break;
    		}
    	}

        return ans;
    }
}