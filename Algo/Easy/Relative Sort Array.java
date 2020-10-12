class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> arr1List = new ArrayList<Integer>();
        List<Integer> arr2List = new ArrayList<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        List<Integer> remainList = new ArrayList<Integer>();
        
        for(int i=0; i<arr1.length; i++){
            arr1List.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            if(arr1List.contains(arr2[i])){
                buildList(arr1, arr2[i], resList);
            }
        }
        
        for(int i=0; i<arr1.length; i++){
            if(!resList.contains(arr1[i])){
               remainList.add(arr1[i]);
            }
        }
        
        Collections.sort(remainList);
        
        int[] res = new int[resList.size() + remainList.size()];
        
        for(int i=0; i<resList.size(); i++){
            res[i] = resList.get(i);
        }
        
        int j=0;
        for(int i=resList.size(); i<res.length; i++){
            res[i] = remainList.get(j);
            j++;
        }
        
        return res;
    }
    
    private void buildList(int[] arr1, int val, List<Integer> resList){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] == val){
                resList.add(val);
            }
        }
    }
    
}

//solution
public int[] relativeSortArray(int[] arr1, int[] arr2) {
int[] array1=new int[1001];
int[] res=new int[arr1.length];

for(int i=0;i<arr1.length;i++)
{
//load count in array
	array1[arr1[i]]++;
}
int j=0;

for(int i=0;i<arr2.length;i++)
  {
 //fill all values sequentially corresponding to arr2
	while(array1[arr2[i]]>0)
	{
		res[j++]=arr2[i];
		array1[arr2[i]]--;
	}
  }
    
    for(int i=0;i<array1.length;i++)
    {
        //getting the remaining values from arr1 which are not in arr2
        while(array1[i]>0)
        {
        res[j++]=i;
        array1[i]--;
        }
        
    }
    return res;
    
}