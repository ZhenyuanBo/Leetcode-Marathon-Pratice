class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0, num=salary.length-2;
        double avg=0.0;
        for(int i=1; i<salary.length-1; i++){
            sum+=salary[i];
        }
        avg = sum/num;
        return avg;
    }
}