class Solution {
    public int countBinarySubstrings(String s) {
        /*
        "00110011" --> convert it to group: [2, 2, 2, 2]
        Math.min(group[i-1], group[i])
        */
        int[] groups = new int[s.length()];
        groups[0] = 1;
        
        int j=0;
        
        //set up groups
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                groups[++j] = 1;
            }else{
                groups[j]++;
            }
        }
        
        int res=0;
        
        for(int i=0; i+1<=j; i++){
            res += Math.min(groups[i], groups[i+1]);
        }
        
        return res;
        
    }
}