class Solution {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        while(true){
            for(int i=0; i<arr.length; i++){
                if(i==0 || i==arr.length-1){
                    list.add(arr[i]);
                }else{
                    if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                        list.add(arr[i]+1);
                    }else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                        list.add(arr[i]-1);
                    }else{
                        list.add(arr[i]);
                    }
                }
            }
            boolean needsTransform=false;
            
            for(int i=0; i<arr.length; i++){
                if(list.get(i)!=arr[i]){
                    arr[i] = list.get(i);
                    needsTransform=true;
                }
            }
            
            if(!needsTransform) break;
            
            list = new ArrayList<Integer>();
            
        }
        
        return list;
    }
}