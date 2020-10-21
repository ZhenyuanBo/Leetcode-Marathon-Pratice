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
    public int minDepth(TreeNode root) {
        
        int pathLeft=0;
        int pathRight=0;
        
        if(root == null) return 0;
        
        pathLeft+=minDepth(root.left);
        pathRight+=minDepth(root.right);
        
        if(pathRight==0 || pathLeft==0)
            return Math.max(pathLeft, pathRight)+1;
        else
            return Math.min(pathLeft, pathRight)+1;
        
    }
}