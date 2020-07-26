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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    private boolean helper(TreeNode root, Integer low, Integer high){
        if(root==null) return true;
        int val = root.val;
        if(low!=null && val<=low) return false;
        if(high!=null && val>=high) return false;
        
        boolean isLeftValidBST = helper(root.left, low, val);
        boolean isRightValidBST = helper(root.right, val, high);
        
        return isLeftValidBST && isRightValidBST;
    }
}
//record lower and upper limit