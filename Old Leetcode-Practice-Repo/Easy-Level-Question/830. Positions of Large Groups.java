class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int size=0;
        for(int i=0; i<S.length(); i++){
            if(!map.containsKey(S.charAt(i))||
				(S.charAt(i) != S.charAt(i-1) && map.get(S.charAt(i-1)).size()<2)){
                
				if(i>0 && size>=3){
                    map.get(S.charAt(i-1)).add(i-1);
                    List<Integer> list = map.get(S.charAt(i-1));
					result.add(list);
				}
                size=0;
				List<Integer> newList = new ArrayList<Integer>();
                newList.add(i);
                map.put(S.charAt(i), newList);
                size++;
            }else{
                size++;
            }
        }
		
        if(size>=3){
            map.get(S.charAt(S.length()-1)).add(S.length()-1);
            result.add(map.get(S.charAt(S.length()-1)));
        }
        
		return result;
    }
}



//solution 
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length(); // i is the start of each group
        for (int j = 0; j < N; ++j) {
            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
                // Here, [i, j] represents a group.
                if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1;
            }
        }

        return ans;
    }
}