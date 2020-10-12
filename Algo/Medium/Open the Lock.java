class Solution {
    public int openLock(String[] deadends, String target) {
        
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        
        List<String> deadendList = Arrays.asList(deadends);
        
        Set<String> seen = new HashSet<String>();
        seen.add("0000");
        
        int step=0;
        
        while(!queue.isEmpty()){
            step++;
            int size = queue.size();
            for(int k=0; k<size;k++){
                String firstNode = queue.poll();
                if(firstNode.equals(target)) return step-1;
                if(deadendList.contains(firstNode)) continue;
                char[] nodeArr = firstNode.toCharArray();
                for (int i = 0; i < 4; ++i) {
                    for (int d = -1; d <= 1; d += 2) {
                        String nei="";
                        nei = firstNode.substring(0, i);
                        int digit = Character.getNumericValue(nodeArr[i]);
                        digit = (digit + d + 10)%10;
                        nei += digit + firstNode.substring(i+1);
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            queue.offer(nei);
                        }
                    }
                }
            }
        }
        
        return -1;
    }
}