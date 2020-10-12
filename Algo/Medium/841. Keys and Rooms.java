class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //use dfs approach
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> st = new Stack();
        st.push(0);
        
        while(!st.isEmpty()){
            int currRoom = st.pop();
            for(int room: rooms.get(currRoom)){
                if(!seen[room]){
                    seen[room] = true;
                    st.push(room);
                }
            }
        }
        
        for(boolean v: seen){
            if(!v) return false;
        }
        
        return true;
    }
}