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
    int len=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        helper(root, root.val);
        return len;
    }
    private int helper(TreeNode root, int val){
        if(root==null) return 0;
        int leftLen = helper(root.left, root.val);
        int rightLen = helper(root.right, root.val);
        len = Math.max(len, leftLen + rightLen);
        if(root.val == val) return Math.max(leftLen, rightLen)+1;
        return 0;
    }
}