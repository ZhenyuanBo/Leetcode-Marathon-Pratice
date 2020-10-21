class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder strBuild = new StringBuilder();
        int startIndex=0;
        int strLen=s.length();
        while(strBuild.length() < s.length()){
        	if(strLen < k){
        		strBuild.append(reverseStrHelper(s.substring(startIndex)));
        	}else if(strLen>=k && strLen<2*k){
        		strBuild.append(reverseStrHelper(s.substring(startIndex, startIndex+k))).append(s.substring(startIndex+k));
        	}else{
        		strBuild.append(reverseStrHelper(s.substring(startIndex, startIndex+k))).append(s.substring(startIndex+k, startIndex+2*k));
        		startIndex = startIndex+2*k;
        		strLen = strLen-2*k;
        	}

        }

        return strBuild.toString();
    }
    private String reverseStrHelper(String s){
    	String str="";
    	for(int i=s.length()-1; i>=0; i--){
    		str+=s.charAt(i);
    	}

    	return str;
    }
}