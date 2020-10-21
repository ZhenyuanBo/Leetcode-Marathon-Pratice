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
    public int maxDepth(TreeNode root) {
        
        int depthLeft=0;
        int depthRight=0;
        
        if(root == null){
            return 0;
        }else{
            depthLeft = 1;
            depthRight = 1;
        }
        
        depthLeft += maxDepth(root.left);
        depthRight += maxDepth(root.right);
        
        return Math.max(depthLeft,depthRight);
        
        
        
    }
}