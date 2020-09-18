class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        if(edges.length==0 && n!=1) return false;
        else if(edges.length==0 && n==1) return true;
        
        //check if one of the node is already visited, if yes, return false;
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int[] edge: edges){
            //bidirectional
            if(!map.containsKey(edge[0])){
                List<Integer> neis = new ArrayList<>();
                neis.add(edge[1]);
                map.put(edge[0], neis);
            }else{
                map.get(edge[0]).add(edge[1]);
            }
            
            if(!map.containsKey(edge[1])){
                List<Integer> neis = new ArrayList<>();
                neis.add(edge[0]);
                map.put(edge[1], neis);
            }else{
                map.get(edge[1]).add(edge[0]);
            }
        }

        Stack<Integer> st = new Stack<>();
        Set<Integer> seen = new HashSet<>();
        
        st.push(edges[0][0]);
        seen.add(edges[0][0]);
        
        while(!st.isEmpty()){
            int node = st.pop();
            for(Integer val: map.get(node)){
                if(!seen.add(val)) return false;
                st.push(val);
                map.get(val).remove((Integer)node);
            }
        }
        
        return seen.size()==n;
    }
}