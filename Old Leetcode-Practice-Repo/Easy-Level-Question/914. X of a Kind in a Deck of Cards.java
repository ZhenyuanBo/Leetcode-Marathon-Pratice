class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        Map<Integer, Integer>map = new HashMap<Integer, Integer>();
        for(int i: deck){
            int counter=map.getOrDefault(i, 0)+1;
            map.put(i, counter);
        }
        
        int groupSize=0;
        
        for(int key: map.keySet()){
            if(groupSize==0){
                groupSize = map.get(key);
            }else{
                groupSize = gcd(groupSize, map.get(key));
            }
        }
        
        return groupSize>=2;
        
        
        
    }
    
    private int gcd(int x, int y){
        return x==0 ? y : gcd(y%x, x);
    }
}

//most important point: finding greatest common divisor
/*
	
	for(int key: map.keySet()){
	if(groupSize==0){
		groupSize = map.get(key);
	}else{
		groupSize = gcd(groupSize, map.get(key));
	}
	
	private int gcd(int x, int y){
		return x==0 ? y : gcd(y%x, x);
	}
*/
}