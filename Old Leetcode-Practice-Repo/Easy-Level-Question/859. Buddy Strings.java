class Solution {
    public boolean buddyStrings(String A, String B) {
        
        if(A.length()!=B.length()) return false;
        
        if(A.equals(B)){
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for(char ch: A.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            boolean checkOne = true;
            
            for(Character key: map.keySet()){
                if(map.get(key)!=1){
                    checkOne=false;
                    break;
                }
            }
            
            if(checkOne) return false;
            
            return true;
        }
        
        List<Integer> listA = new ArrayList<Integer>();
        
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                listA.add(i);
            }
        }
        
        if(listA.size() != 2) return false;
        
        char[] arrA = A.toCharArray();  
        char temp = A.charAt(listA.get(1));
        
        arrA[listA.get(1)] = A.charAt(listA.get(0));
        arrA[listA.get(0)] = temp;
        
        String newA = new String();
        
        for(char ch: arrA){
            newA+=ch;
        }
        
        if(newA.equals(B)) return true;
        
        return false;
 
    }
}