class Solution {
    public String reorganizeString(String S) {
        //using priority queue to perform the rearrangement
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: S.toCharArray()){
            int count = map.getOrDefault(c, 0)+1;
            //if a character appears more than twice, it is impossible to get any result
            if(count > (S.length()+1)/2) return "";
            map.put(c, count);
        }
        //construct the priority queue with elements sorted according to the count
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(b[1]-a[1]));
        for(char key: map.keySet()){
            pq.add(new int[]{key, map.get(key)});
        }
        StringBuilder sb = new StringBuilder();
        
        //traverse through the priority queue and construct a string in which there is no two same letters placed adjacent to each other
        while(!pq.isEmpty()){
            int[] firstArr = pq.poll();
            if(sb.length()==0 || firstArr[0]!=sb.charAt(sb.length()-1)){
                sb.append((char)firstArr[0]);
                if(--firstArr[1]>0){
                    pq.add(firstArr);
                }
            }else{
                int[] secondArr = pq.poll();
                sb.append((char)secondArr[0]);
                if(--secondArr[1]>0){
                    pq.add(secondArr);
                }
                pq.add(firstArr);
            }
        }
        
        return sb.toString();
        
        
    }
}