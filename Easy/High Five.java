class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> idScoreMap = new HashMap<Integer, List<Integer>>();
        
        for(int i=0; i<items.length; i++){
            int studentId = items[i][0];
            int score = items[i][1];
            if(idScoreMap.containsKey(studentId)){
                idScoreMap.get(studentId).add(score);
            }else{
                List<Integer> scoreList = new ArrayList<Integer>();
                scoreList.add(score);
                idScoreMap.put(studentId, scoreList);
            }
        }
        int[][] res = new int[idScoreMap.keySet().size()][2];
        int j=0;
        for(Integer key: idScoreMap.keySet()){
            Collections.sort(idScoreMap.get(key));
            System.out.println(idScoreMap.get(key));
            int sum=0;
            int avg=0;
            for(int index=idScoreMap.get(key).size()-1; index>=idScoreMap.get(key).size()-5; index--){
                sum+=idScoreMap.get(key).get(index);
            }
            avg = sum/5;
            res[j][0] = key;
            res[j][1] = avg;
            j++;
        }
        
        return res;
    }
}