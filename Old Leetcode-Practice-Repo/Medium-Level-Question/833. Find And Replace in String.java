class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        List<Integer> indexList = new ArrayList<Integer>();
        
        for(int i=0; i<indexes.length; i++){
            List<String> list = new ArrayList<String>();
            list.add(sources[i]);
            list.add(targets[i]);
            map.put(indexes[i], list);
        }
        
        for(int i: indexes){
            String src = map.get(i).get(0);
            for(int j=i; j<src.length(); j++){
                if(S.charAt(j)!=src.charAt(j)) break;
                else{
                    indexList.add(j);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length();){
            if(map.keySet().contains(i)){
                String src = map.get(i).get(0);
                if(containStr(S.substring(i), src)){
                    String replace = map.get(i).get(1);
                    sb.append(replace);
                    i+=src.length();
                }else{
                    sb.append(S.substring(i, i+src.length()));
                    i+=src.length();
                }
            }else{
                if(!indexList.contains(i)) sb.append(S.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    public boolean containStr(String src, String tgt){
        for(int i=0; i<tgt.length(); i++){
            if(src.charAt(i)!=tgt.charAt(i)) return false;
        }
        return true;
    }
}