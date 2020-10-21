class Solution {
    public boolean wordPattern(String pattern, String str) {

    	String[] strArray = str.split("\\s+");

    	if(pattern.length()!=strArray.length) return false;

    	Map<Character, String> charStrMap = new HashMap<Character, String>();

    	for(int i=0;i<pattern.length();i++){
    		if(charStrMap.containsKey(pattern.charAt(i))){
    			if(!charStrMap.get(pattern.charAt(i)).equals(strArray[i])) return false;
    		}else{
    			if(charStrMap.values().contains(strArray[i])) return false;
    			charStrMap.put(pattern.charAt(i),strArray[i]);
    		}
    	}

    	return true;

    }
}
