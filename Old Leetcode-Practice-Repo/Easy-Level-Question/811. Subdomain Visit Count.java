class Solution {
    
    public Map<String, Integer> map = new HashMap<String, Integer>();
    
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<String>();
        for(String str: cpdomains){
            String subdomain = str.split("\\s+")[1];
            int count = Integer.parseInt(str.split("\\s+")[0]);
            visitCheck(subdomain, count);   
        }
        for(String key : map.keySet()){
            String ansStr = map.get(key)+" "+key;
            res.add(ansStr);
        }
        return res;
    }
    public void visitCheck(String subdomain, int count){
   
        String[] subdomainList = subdomain.split("\\.");
        int visitNum=0;
        String baseDomain=subdomainList[subdomainList.length-1];
        map.put(baseDomain, map.getOrDefault(baseDomain,0)+count);
        
        for(int i=subdomainList.length-2; i>=0; i--){
            baseDomain = subdomainList[i]+"."+ baseDomain;
            visitNum = map.getOrDefault(baseDomain, 0)+count;
            map.put(baseDomain, visitNum);
        }
    }
}