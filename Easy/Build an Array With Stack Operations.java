class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        Stack<Integer> s = new Stack();
        
        int j=0;
        
        for(int i=1; i<=n; i++){
            if(j==target.length) break;
            s.push(i);
            res.add("Push");
            
            if(s.peek() == target[j]){
                j++;
            }else{
                s.pop();
                res.add("Pop");
            }
        }
        
        return res;
    }
}