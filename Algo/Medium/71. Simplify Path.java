class Solution {
    public String simplifyPath(String path) {
        if(path.isEmpty()) return path;
        
        Stack<String> st = new Stack<>();
        //using / as the delimiter
        String[] directories = path.split("/");
        
        for(String directory: directories){
            if(directory.equals(".") || directory.isEmpty()){
                continue;
            }else if(directory.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(directory);
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        for(String directory: st){
            res.append("/");
            res.append(directory);
        }
        
        return res.length()>0 ? res.toString() : "/";
    }
}