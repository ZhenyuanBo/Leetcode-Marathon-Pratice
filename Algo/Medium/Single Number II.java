//hashset - O(n) time complexity + O(n) space complexity
class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Long> set = new HashSet<>();
        long sumSet=0, sumArray=0;
        
        for(int i: nums){
            if(set.add((long)(i))){
                sumSet+=i;
            }
            sumArray+=(long)i;
        }
        
        return (int)((3*sumSet - sumArray)/2);
        
    }
}

//hashmap - O(n) time complexity + O(n) space complexity
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int freq = map.getOrDefault(num, 0)+1;
            map.put(num, freq);
        }
        
        int ans=0;
        
        for(Integer key: map.keySet()){
            if(map.get(key)==1){
                ans = key;
                break;
            }
        }
        
        return ans;
    }
    
}

//bitmask - O(n) time complexity + O(1) space complexity

class Solution {
  public int singleNumber(int[] nums) {
    int seenOnce = 0, seenTwice = 0;

    for (int num : nums) {
        seenOnce = ~seenTwice&(seenOnce^num);
        seenTwice = ~seenOnce&(seenTwice^num);
    }

    return seenOnce;
  }
}
