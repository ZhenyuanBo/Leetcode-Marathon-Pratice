class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            int count=0;
            for(int j=i+1; j<temperatures.length; j++){
                if(temperatures[j]<=temperatures[i])
                    ++count;
                else{
                    output[i] = ++count;
                    break;
                }
            }
        }
        return output;
    }
}