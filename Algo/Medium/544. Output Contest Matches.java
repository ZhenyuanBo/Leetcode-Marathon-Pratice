class Solution {
    public String findContestMatch(int n) {
        int i=1, j=n;
        String res = "";
        while(i<j){
            res+="(" + i + "," + j + ") ";
            i++;
            j--;
        }
        res = res.trim();
        String[] arr = res.split(" ");
        int numPairs = arr.length / 2;
        
        while(numPairs>=1){
            int left=0, right=arr.length-1;   
            res = "";
            while(left<right){
                res += "(" + arr[left] + "," + arr[right] + ") ";
                left++;
                right--;
            }
            numPairs -= 1;
            res = res.trim();
            arr = res.split(" ");
            if(arr.length==1) break;
        }
        res = res.replace(" ", ",");
        return res;
    }
}