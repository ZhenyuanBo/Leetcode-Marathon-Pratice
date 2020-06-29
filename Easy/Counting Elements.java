class Solution {
    public int countElements(int[] arr) {
        List<Integer> arrList = new ArrayList<Integer>();
        for(int i: arr){
            arrList.add(i);
        }
        
        int count=0;
        
        for(int i: arr){
            int newVal = i+1;
            if(arrList.contains(newVal)){
                count++;
            }
        }
        
        return count;
    }
}