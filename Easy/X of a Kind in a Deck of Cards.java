class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        if(deck.length==1) return false;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int minFreq = Integer.MAX_VALUE;
        
        for(int i: deck){
            int freq = map.getOrDefault(i, 0)+1;
            map.put(i, freq);
        }
        
        List<Integer> list = new ArrayList<Integer>(map.values());
        int g=0;
            
        for(int i=1; i<list.size(); i++){
            int curr = list.get(i);
            
            if(g==0){
                g = GCD(list.get(0), curr);
            }else{
                g = GCD(g, curr);
            }
            
            if(g==1) return false;
        }
        
        return true;
    }
    private int GCD(int a, int b) {
        if (a == 0)
            return b;
        
        return GCD(b % a, a);
    }
}