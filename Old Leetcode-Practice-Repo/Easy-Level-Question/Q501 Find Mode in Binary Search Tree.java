/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private Map<Integer, Integer> hsmap = new HashMap<Integer, Integer>();
    
    public int[] findMode(TreeNode root) {
        findModeHelper(root);
        
        int maxCount = Integer.MIN_VALUE;
        
        for(Integer i: hsmap.values()){
            if(i>maxCount)
                maxCount = i;
        }
        
        List<Integer> ansList = new ArrayList<Integer>();
        
        for(Integer i: hsmap.keySet()){
            if(hsmap.get(i) == maxCount){
                ansList.add(i);
            }
        }
        
        int[] ansArray = new int[ansList.size()];
        
        int index=0;
        
        for(Integer i: ansList){
            ansArray[index] = i;
            index++;
        }
        return ansArray;
    }
    
    private void findModeHelper(TreeNode root){
        
        if(root == null) 
            return;
        else if(root!=null){
            int count = hsmap.getOrDefault(root.val, 0)+1;
            hsmap.put(root.val, count);
        }
        
        findModeHelper(root.left);
        findModeHelper(root.right);
        
        return;
    }
    
    
}