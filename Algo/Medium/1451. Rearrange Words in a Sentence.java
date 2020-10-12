class Solution {
    public String arrangeWords(String text) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        String[] textArr = text.split("\\s+");
        
        for(String str: textArr){
            int strLen = str.length();
            str = str.toLowerCase();
            if(map.containsKey(strLen)){
                map.get(strLen).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(strLen, list);
            }
        }
        
        String res = "";
        boolean flag=true;
        
        for(List<String> list: map.values()){
            for(String str: list){
                if(flag){
                    char firstLetter = Character.toUpperCase(str.charAt(0));
                    if(str.length()>1){
                        res+=firstLetter + str.substring(1)+" ";
                    }else{
                        res+=firstLetter+" ";
                    }
                    flag=false;
                }else{
                    res+=str+" ";
                }
            }
        }
        
        res = res.trim();
        
        return res;
    }
}