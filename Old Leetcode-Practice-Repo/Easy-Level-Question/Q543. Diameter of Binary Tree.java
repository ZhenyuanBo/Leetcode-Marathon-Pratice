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

    //max value is used to track the maximum distance
    public int max=0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    private int maxDepth(TreeNode root){
        
        if(root==null) return 0;
        
        int leftDiameter=0;
        int rightDiameter=0;
        
        if(root.left!=null){
            leftDiameter=1;
        }
        
        leftDiameter+=maxDepth(root.left);
        
        if(root.right!=null){
            rightDiameter=1;
        }
        
        rightDiameter+=maxDepth(root.right);
        
        max = Math.max(max, leftDiameter + rightDiameter);
        
        return Math.max(leftDiameter, rightDiameter);
    }
}