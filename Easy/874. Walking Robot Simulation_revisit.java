class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer, TreeSet<Integer>> horizontalMap = new HashMap();
        HashMap<Integer, TreeSet<Integer>> verticalMap = new HashMap();
        
        for(int i=0; i<obstacles.length; i++){
            

            if(horizontalMap.containsKey(obstacles[i][1])){
                horizontalMap.get(obstacles[i][1]).add(obstacles[i][0]);
            }else{
                TreeSet<Integer> hset = new TreeSet<>();
                hset.add(obstacles[i][0]);
                horizontalMap.put(obstacles[i][1], hset);
            }

            if(verticalMap.containsKey(obstacles[i][0])){
                verticalMap.get(obstacles[i][0]).add(obstacles[i][1]);
            }else{
                TreeSet<Integer> vset = new TreeSet<>();
                vset.add(obstacles[i][1]);
                verticalMap.put(obstacles[i][0], vset);
            }
        }

        
        int maxDist = 0;
        int x = 0;
        int y = 0;
        int currentDir = 1; // 1 represents North, 2 represents east, 3-S, 4-W
        for(int i = 0; i < commands.length; i++) {
            int command = commands[i];
            switch (command) {
                case -2 :
                    currentDir = (currentDir-1 == 0 ? 4 : currentDir-1);
                    break;
                case -1:
                    currentDir = (currentDir+1 == 5 ? 1 : currentDir+1);
                    break;
                default:
                    if (currentDir == 1) {
                        y = findDestinationAsc(verticalMap, x, y, command);
                    } else if (currentDir == 2) {
                        x = findDestinationAsc(horizontalMap, y, x, command);
                    } else if (currentDir == 3) {
                        y = findDestinationDesc(verticalMap, x, y, command);
                    } else {
                        x = findDestinationDesc(horizontalMap, y, x, command);
                    }
                    maxDist = Math.max(maxDist, x*x + y*y);
                    break;
            }
        }
        
        return maxDist;
    }
    
    private int findDestinationAsc(HashMap<Integer, TreeSet<Integer>> map, int fixPosition, int movePosition, int desiredDist) {
        TreeSet<Integer> obstacles = map.getOrDefault(fixPosition, new TreeSet());
        Integer closetObstacle = obstacles.ceiling(movePosition+1);
        if (closetObstacle != null) {
            return Math.min(closetObstacle-1, movePosition+desiredDist);
        } else {
            return movePosition+desiredDist;
        }
    }
    
    private int findDestinationDesc(HashMap<Integer, TreeSet<Integer>> map, int fixPosition, int movePosition, int desiredDist) {
        TreeSet<Integer> obstacles = map.getOrDefault(fixPosition, new TreeSet());
        Integer closetObstacle = obstacles.floor(movePosition-1);
        
        if (closetObstacle != null) {
            return Math.max(closetObstacle+1, movePosition-desiredDist);
        } else {
            return movePosition-desiredDist;
        }
    }
}