/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root, list, root.val);
        
        return list.size();
    }
    private void helper(TreeNode root, List<TreeNode> list, int currMax){

        if(root.left!=null){
            helper(root.left, list, Math.max(root.left.val, currMax));
        }
        
        if(root.val == currMax) list.add(root);
        
        if(root.right!=null){
           helper(root.right, list, Math.max(root.right.val, currMax)); 
        }
    }
}