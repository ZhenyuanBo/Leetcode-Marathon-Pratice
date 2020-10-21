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
    public TreeNode pruneTree(TreeNode root) {
        int finalSum = helper(root);
        if(finalSum!=0) return root;
        
        return null;
    }
    private int helper(TreeNode root){
        if(root==null) return 0;
        int sum=0, sumLeft=0, sumRight=0;
        
        int currVal=root.val;
        
        sumLeft+=helper(root.left);
        sumRight+=helper(root.right);
        
        if(sumLeft==0) root.left=null;
        if(sumRight==0) root.right=null;
        
        sum = currVal + sumLeft+sumRight;
        return sum;
    }
}