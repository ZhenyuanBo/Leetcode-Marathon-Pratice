class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int index = nums[i]-1;
            arr[index]++;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                list.add(i+1);
            }
        }
        
        return list;
    }
}

//solution
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //list to hold missing elements
       List<Integer> list = new ArrayList<Integer>();
        
        //populate the list with all the values 1 ≤ a[i] ≤ nums.length
        for(int i=1;i<=nums.length;i++)
        {
            list.add(i);
        }
        
       //loop throught the array and set all the values present in the array to zero in the list
        for(int i : nums)
        {
            list.set(i-1,0);
            
        }
        
        //remove all the values in the list that are zero - missing elements in the array will remain    in the list    
        list.removeAll(Collections.singleton(0));
        
        return list;
    }
}