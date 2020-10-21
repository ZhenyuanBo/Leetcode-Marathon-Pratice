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
    
    public int sum=0;
    
    public TreeNode convertBST(TreeNode root) {
        convertHelper(root);
        
        return root;
    }
    private void convertHelper(TreeNode root){
        if(root==null) return;
        
        convertHelper(root.right);
        
        root.val += sum;
        
        sum = root.val;
        
        convertHelper(root.left);
    }
}