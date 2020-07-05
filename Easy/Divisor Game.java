class Solution {
    public boolean divisorGame(int N) {
        
        if(N==1) return false;
        
        boolean[] results = new boolean[N+1];
        results[1] = false;
        results[2] = true;
        
        for(int i=3; i<=N; i++){
            results[i] = false;
            for(int m=1; m<i; m++){
                if(i%m==0 && !results[i-m]){
                    results[i] = true;
                    break;
                }
            }
        }
        return results[N];
    }
}