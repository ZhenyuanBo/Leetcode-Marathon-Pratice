class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++){
            result[i]=i;
        }
        for(int j=0; j<A.length; j++){
            result[j] = numberRetriever(j, A);
        }
        return result;
    }
    private int numberRetriever(int index, int[] A){
        int num=0;
        for(int i=0; i<A.length; i++){
            if(index%2!=0 && A[i]!=-1 && A[i]%2!=0){
                num = A[i];
                A[i]=-1;
                break;
            }else if(index%2==0 && A[i]!=-1 && A[i]%2==0){
                num = A[i];
                A[i]=-1;
                break;
            }
        }
        return num;
    }
}

//--------------------------------------
//solution:
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            ans[t] = x;
            t += 2;
        }

        t = 1;
        for (int x: A) if (x % 2 == 1) {
            ans[t] = x;
            t += 2;
        }

        return ans;
    }
}
