class Solution {
    public int[] constructRectangle(int area) {

    	int val = (int)Math.sqrt(area);
    	int[] ans = new int[2];

    	if(area % val ==0){
    		if(area / val > val){
                ans[0] = area/val;
                ans[1] = val;
            }else{
                ans[0] = val;
                ans[1] = area/val;
            }
    		return ans;
    	}

    	while(val != 0){
    		val--;
    		if(area % val == 0){
    			if(area / val > val){
    				int len = area / val;
    				int width = val;
    				ans[0] = len;
    				ans[1] = width;
    				break;
    			}
    		}
    	}

    	return ans;

        
    }
}