class Solution {
    public int numSpecialEquivGroups(String[] A) {
        
        //assign number (1, 2 ,3) to each letter and check if the numbers are the same (means S==T)
        List<String> list = new ArrayList<String>();
        
        for(String str: A){
            int[] result = new int[26];
            for(int i=0;i<str.length();i++){
                int index = (int)str.charAt(i)-97;
                if(result[index]>0){
                    result[index]=3;
                }else if(i%2==0){
                    result[index]=2;
                }else{
                    result[index]=1;
                }
            }
            String newStr = new String();
            for(int i: result){
                newStr+=i;
            }
            
            if(!list.contains(newStr)){
                list.add(newStr);
            } 
        }
        
        return list.size();
    }
}