class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //use hashmap to build out a graph first
        //we probably can use hashmap to build graph
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<prerequisites.length; i++){
            int preq = prerequisites[i][1];
            if(map.containsKey(preq)){
                map.get(preq).add(prerequisites[i][0]);
            }else{
                List<Integer> nextCourses = new ArrayList<>();
                nextCourses.add(prerequisites[i][0]);
                map.put(preq, nextCourses);
            }
        }
        
        //use visited for backtracking purpose
        boolean[] visited = new boolean[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(hasCycle(i, map, visited)){
                return false;
            }
        }
        
        return true;
    }
    private boolean hasCycle(int currCourse, Map<Integer, List<Integer>> map, boolean[] visited){
        if(visited[currCourse]) return true;
        
        if(!map.containsKey(currCourse)) return false;
        
        visited[currCourse] = true;

        for(Integer course: map.get(currCourse)){
           if(hasCycle(course, map, visited)){
               visited[currCourse] = false;
               return true;
           }
        }
        
        visited[currCourse] = false;
        return false;

    }
}