class Solution {
    public int getKth(int lo, int hi, int k) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        for(int i=lo; i<=hi; i++){
            int power = stepCalculate(i);
            if(map.containsKey(power)){
                map.get(power).add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(power, list);
            }
        }
        
        List<Integer> resList = new ArrayList<>();
        
        for(List<Integer> item: map.values()){
            Collections.sort(item);
            for(Integer val: item){
                resList.add(val);
            }
        }

        return resList.get(k-1);
    }
    private int stepCalculate(int num){
        int step=0;
        
        while(num!=1){
            if(num%2==0){
                num/=2;
            }else{
                num = num*3+1;
            }
            step++;
        }
        
        return step;
    }
}