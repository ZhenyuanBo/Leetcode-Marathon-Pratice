class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<Integer>();
        int[] table = new int[26];
        for(char c: S.toCharArray()){
            table[c-'a']++;
        }
        int i=0,j=0, counter=0;
        Set<Character> hs = new HashSet<Character>();
        while(j<S.length()){
            char c = S.toCharArray()[j];
            if(!hs.contains(c)){
                hs.add(c);
                counter++;
            }
            table[c-'a']--;
            j++;
            if(table[c-'a'] == 0){
                //remove character from the hashset
                hs.remove(c);
                counter--;
            }
            //start new partition
            if(counter==0){
                list.add(j-i);
                i=j;
            }
            
        }
        return list;
    }
}