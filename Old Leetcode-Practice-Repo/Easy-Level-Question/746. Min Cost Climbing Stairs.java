class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for(int i=2; i<cost.length; i++){
            minCost[i] = Math.min(minCost[i-1], minCost[i-2]) + cost[i];
        }
        return Math.min(minCost[cost.length-1], minCost[cost.length-2]);
    }
}

//solution:

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}