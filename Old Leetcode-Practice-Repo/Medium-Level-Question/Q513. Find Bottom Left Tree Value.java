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
    
    public int findBottomLeftValue(TreeNode root) {
        int depth=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        helper(root, depth, map);
        
        if(map.isEmpty())
            return root.val;
        
        int maxDepth = Collections.max(map.keySet());
        return map.get(maxDepth);
    }
    private void helper(TreeNode root, int d, Map<Integer, Integer>hsmap){
        if(root==null) return;
        
        if(root.left!=null){
            if(hsmap.get(d)==null) hsmap.put(d, root.left.val);
        }else if(root.right!=null){
            if(hsmap.get(d)==null) hsmap.put(d, root.right.val);
        }
        
        helper(root.left, d+1, hsmap);
        helper(root.right,d+1, hsmap);
    }
}